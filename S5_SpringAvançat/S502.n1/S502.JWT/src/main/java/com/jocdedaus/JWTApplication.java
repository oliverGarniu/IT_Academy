package com.jocdedaus;

import com.jocdedaus.demo.security.model.Role;
import com.jocdedaus.demo.security.model.User;
import com.jocdedaus.demo.security.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class JWTApplication {

    public static void main(String[] args) {
        SpringApplication.run(JWTApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "Kai Otton", "Kai", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Sunny Garcia", "Sunny", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Mick Fanning", "Mick", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "John Florence", "John", "1234", new ArrayList<>()));

            userService.addRoleToUser("Kai", "ROLE_USER");
            userService.addRoleToUser("Kai", "ROLE_ADMIN");
            userService.addRoleToUser("Sunny", "ROLE_USER");
            userService.addRoleToUser("Mick", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("John", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("John", "ROLE_MANAGER");
        };
    }
}
