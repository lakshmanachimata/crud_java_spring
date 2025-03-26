// filepath: /Users/lakshmana/projects/prep/crud_java_spring/src/main/java/com/nearhop/crud/config/OpenApiConfig.java
package com.nearhop.crud.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("CRUD API Documentation")
                        .version("1.0")
                        .description("API documentation for the CRUD application"));
    }
}