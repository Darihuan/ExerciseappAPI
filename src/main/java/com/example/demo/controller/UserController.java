package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Exercise;
import com.example.demo.model.User;
import com.example.demo.service.UserServices;

@RestController()
@RequestMapping(path="/aplicacion/usuario")
public class UserController {
	private UserServices userservice;


	public UserController(UserServices userservice) {
		this.userservice=userservice;
	}
	@GetMapping(path="/list")
	public List<User> listusers(){
		return userservice.listusers();
	}
	@GetMapping( path="/{id}")
	public User getUserbyid(@PathVariable("id")long id) {
		return userservice.getUserbyid( id);
	}
	@PostMapping
	public void addUser(@RequestBody User user) {
		userservice.addUser(user);
	}
	

}
