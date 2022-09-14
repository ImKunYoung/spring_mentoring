package com.example.test1234.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/hello")
    public String getHello(Model model) {
        model.addAttribute("test", "테스트입니다");
        return "bye";
    }

}
