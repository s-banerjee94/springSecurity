package com.example.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.User;
import com.example.services.UserServices;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserServices userServices;

	@GetMapping("/users")
	public List<User> getUser() {
		return this.userServices.getUsers();
	}
	
	@GetMapping("/currentUser")
	public String currentUser(Principal principal) {
		return principal.getName();
	}
}
