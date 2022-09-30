package com.bolsadeudeas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/index","/","/home"})
    public String home (Model model){
        return "forward:/app/index";
    }
}
