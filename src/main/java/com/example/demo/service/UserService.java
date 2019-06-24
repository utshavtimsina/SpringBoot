package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;




@Component
public class UserService {
	   @Autowired 
	   UserRepository repository;
	   
	   
	   public List<User> allUser(){
		   
		   return (List<User>) repository.findAll();
	   }
	   
	   public Object getUserById(Long id) {
		   return repository.findById(id);
	   }
}
