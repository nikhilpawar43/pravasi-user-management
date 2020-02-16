package com.pravasi.pravasiusermanagement.services;

import com.pravasi.pravasiusermanagement.model.User;
import com.pravasi.pravasiusermanagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long userId) {
        return userRepository.findById(userId);
    }

    public Optional<User> findByDriverId(Long driverId) {

        User user = userRepository.findByDriverId(driverId);
        Optional<User> optionalDriver = Optional.ofNullable(user);
        return optionalDriver;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
