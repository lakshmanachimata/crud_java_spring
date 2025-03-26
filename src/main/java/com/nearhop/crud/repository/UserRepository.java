package com.nearhop.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nearhop.crud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}