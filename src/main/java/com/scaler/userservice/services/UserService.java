package com.scaler.userservice.services;

import com.scaler.userservice.models.User;
import com.scaler.userservice.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public User getUser(Long id);
    public List<User> getAllUsers();

    public User createUser(User user);
}
