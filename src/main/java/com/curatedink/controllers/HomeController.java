package com.curatedink.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/landing")
    public String welcome() {
        return "home";
    }
}
