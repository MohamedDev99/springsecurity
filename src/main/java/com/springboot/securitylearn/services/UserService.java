package com.springboot.securitylearn.services;


import com.springboot.securitylearn.entities.User;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService(){
          User user = User.builder()
                  .username("abc")
                  .password("abc")
                  .email("abc@gmail.com")
                  .build();

          User user1 = User.builder()
                  .username("xyz")
                  .password("xyz")
                  .email("xyz@gmail.com")
                  .build();

          User user2 = User.builder()
                  .username("mvc")
                  .password("mvc")
                  .email("mvc@gmail.com")
                  .build();

         list.add(user);
         list.add(user1);
         list.add(user2);

    }

    public List<User> getUsers(){
        return this.list;
    }


    public User getUser(String username){
        return this.list.stream().filter(((user) -> user.getUsername().equals(username))).findAny().orElse(null);
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}
