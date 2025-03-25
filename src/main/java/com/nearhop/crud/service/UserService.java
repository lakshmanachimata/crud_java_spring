package com.nearhop.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nearhop.crud.model.User;
import com.nearhop.crud.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    public User updateUser(User user) {
        return userRepository.findById(user.getId())
                .map(iUser -> {
                    iUser.setName(user.getName());
                    iUser.setEmail(user.getEmail());
                    return userRepository.save(iUser);
                })
                .orElseThrow(() -> new RuntimeException("User not found with id " + user.getId()));
    }
}