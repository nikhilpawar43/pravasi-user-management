package com.pravasi.pravasiusermanagement.controllers;

import com.pravasi.pravasiusermanagement.model.User;
import com.pravasi.pravasiusermanagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping(value = "/{userId}")
    public User findAllById(@PathVariable("userId") Long userId) {
        Optional<User> optionalUser = userService.findById(userId);
        return optionalUser.orElse(null);
    }

    @GetMapping(value = "/driver/{driverId}")
    public User findAllByDriverId(@PathVariable("driverId") Long driverId) {
        Optional<User> optionalDriver = userService.findByDriverId(driverId);
        return optionalDriver.orElse(null);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Long> createUser(@RequestBody User user) {
        User persistedUser = userService.createUser(user);
        ResponseEntity<Long> response = new ResponseEntity<>(user.getId(), HttpStatus.CREATED);
        return response;
    }

}
