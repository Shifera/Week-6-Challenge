package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }
    @RequestMapping("/about")
    public String ShiferawPage(){
        return "about";
    }
    @RequestMapping("/portfolio")
    public String resumePage(){
        return "portfolio";
    }
}