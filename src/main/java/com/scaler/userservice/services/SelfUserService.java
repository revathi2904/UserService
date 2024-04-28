package com.scaler.userservice.services;

import com.scaler.userservice.models.User;
import com.scaler.userservice.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SelfUserService implements UserService{
    UserRepository userRepository;
    public SelfUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User getUser(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        System.out.println(id);
        System.out.println(optionalUser);

        if (optionalUser.isEmpty()) {
            // throw exception
        }

        User userinfo = optionalUser.get();

        return userinfo;
    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findBy();
    }

    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }
}
