package com.teambcmsspringboot.teambcmsspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teambcmsspringboot.teambcmsspringboot.model.user;
import com.teambcmsspringboot.teambcmsspringboot.repository.userRepository;

@RestController
public class userController {

  @Autowired
  private userRepository UserRepository;

  @PostMapping("/user")
  user newUser(@RequestBody user newUser){
    return UserRepository.save(newUser);


  }
}
