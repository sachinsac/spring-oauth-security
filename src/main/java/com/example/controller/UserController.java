package com.example.controller;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@GetMapping
	@PreAuthorize("#oauth2.hasScope('READ')")
	public String showAuthUser(Principal principal) {
		if(principal == null)
			return "Hello user";
		
		System.out.println(principal.toString());
		
		return "Hello, "+principal.getName()+", thank you for logging in";
	}
}
