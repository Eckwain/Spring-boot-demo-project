package com.example.demo.service;


import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        return Arrays.asList(
                new Post("Hello World!", 13),
                new Post("Spring Boot initialized!", 18),
                new Post("Изучаю Thymeleaf и шаблоны.", 94)
        );
    }
}
