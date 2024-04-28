package com.scaler.userservice.controllers;

import com.scaler.userservice.models.User;
import com.scaler.userservice.services.SelfUserService;
import com.scaler.userservice.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class userController {
    SelfUserService selfUserService;

    public userController(SelfUserService selfUserService){
        this.selfUserService = selfUserService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return selfUserService.getAllUsers();
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id){
        return new ResponseEntity<>(
                selfUserService.getUser(id), HttpStatus.OK
        );
    }

    @PostMapping()
    public User createUser(@RequestBody User user)
    {
        return selfUserService.createUser(user);
    }

}
