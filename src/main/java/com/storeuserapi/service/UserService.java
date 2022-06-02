package com.storeuserapi.service;

import com.storeuserapi.entities.User;
import com.storeuserapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void insert(User user){
        this.userRepository.insert(user);
    }

    public void delete(String id){
        this.userRepository.deleteById(id);
    }

    public Optional<User> findByID(String id){
       return this.userRepository.findById(id);
    }
}
