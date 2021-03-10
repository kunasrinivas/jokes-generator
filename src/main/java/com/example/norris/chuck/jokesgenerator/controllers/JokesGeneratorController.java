package com.example.norris.chuck.jokesgenerator.controllers;

import com.example.norris.chuck.jokesgenerator.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesGeneratorController {
    private final JokeService jokeService;
    @Autowired
    public JokesGeneratorController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return ("index");
    }
}
