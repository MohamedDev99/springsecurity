package com.springboot.securitylearn.controller;


import com.springboot.securitylearn.entities.User;
import com.springboot.securitylearn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        String name = username;
        return userService.getUser(username);
    }


    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/home")
    public String homePage(){
        return "this is home page";
    }


    @GetMapping("/login")
    public String loginPage(){
        return "this is login page";
    }

    @GetMapping("/register")
    public String registerPage(){
        return "this is register page";
    }}
