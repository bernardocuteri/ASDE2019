package it.unical.demacs.asde2019.blog.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import it.unical.demacs.asde2019.blog.model.BlogPost;

@Service
public class BlogService {
	
	private List<BlogPost> posts;
	
	@PostConstruct
	public void init() {
		posts = new ArrayList<BlogPost>();
		posts.add(new BlogPost(1, "ciccio", "Pizza", "I love pizza"));
		posts.add(new BlogPost(2, "pippo", "Pasta", "Do you guys like pasta?"));
	}
	
	public BlogPost getLatestPost() {
		return posts.get(posts.size()-1);
	}

	public List<BlogPost> getAllPosts() {
		return posts;
	}

}
