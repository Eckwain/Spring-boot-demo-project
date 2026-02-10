package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsViewController {

    @Autowired
    PostService postsService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
//        model.addAttribute("appName", "Моё супер приложение!");
        model.addAttribute("posts", postsService.listAllPosts());
        return "list";
    }

    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create(Model model) {
        return "create";
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        postsService.create(text); // Сохраняем пост через сервис
        return "redirect:/";      // Перенаправляем на главную страницу
    }

    @ResponseBody
    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") Long id) {
        return "Здесь будет страница поста №" + id;
    }

}
