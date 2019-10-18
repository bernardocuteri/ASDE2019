package it.unical.demacs.asde2019.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.unical.demacs.asde2019.blog.model.BlogPost;
import it.unical.demacs.asde2019.blog.services.BlogService;
import it.unical.demacs.asde2019.blog.services.LoginService;

@RestController
public class BlogMainController {

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private BlogService blogService;
	
	@GetMapping("/")
	public String welcomeMessage() {
		return "<h1>Welcome to the blog</h1>";
	}
	
	@GetMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password) {
		if(loginService.login(username, password)) {
			return "Success";
		}
		return "Failed to login";
	}
	
	@CrossOrigin
	@GetMapping("/getLatestPost") 
	public BlogPost getLatestPost() {
		return blogService.getLatestPost();
	}
	
	
	@CrossOrigin
	@GetMapping("/getAllPosts") 
	public List<BlogPost> getAllPosts() {
		return blogService.getAllPosts();
	}
	
	
	
	
	
	
	
	
	
	
	
}
