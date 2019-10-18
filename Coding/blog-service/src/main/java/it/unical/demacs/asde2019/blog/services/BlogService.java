package it.unical.demacs.asde2019.blog.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import it.unical.demacs.asde2019.blog.model.BlogPost;

@Service
public class BlogService {

	public BlogPost getLatestPost() {
		return new BlogPost(10, "ciccio", "pizza", "I love pizza");
	}

	public List<BlogPost> getAllPosts() {
		return Arrays.asList(
				new BlogPost(1, "ciccio", "Pizza", "I love pizza"),
				new BlogPost(2, "pippo", "Pasta", "Do you guys like pasta?"));
	}

}
