package com.jocdedaus.demo.security.service;

import com.jocdedaus.demo.security.model.Role;
import com.jocdedaus.demo.security.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
