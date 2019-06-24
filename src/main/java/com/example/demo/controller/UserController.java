package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController {
	 @Autowired 
	 UserService service;
	  @GetMapping
	public List<User> allUsers(){
		return service.allUser();
	}
	@GetMapping("/{id}")
	public Object userById(@PathVariable(required = true) long id) {
		return service.getUserById(id);
		
	}
}
