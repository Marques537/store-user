package com.storeuserapi.controller;

import com.storeuserapi.entities.User;
import com.storeuserapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;

    @PostMapping()
    public void insert(@RequestBody User user){
        this.userService.insert(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        this.userService.delete(id);
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable String id){
        return this.userService.findByID(id);
    }
}
