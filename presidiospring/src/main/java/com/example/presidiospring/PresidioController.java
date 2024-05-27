package com.example.presidiospring;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PresidioController {
    
    @GetMapping("/")
    public String forward() {
        return "index";
    }
}
