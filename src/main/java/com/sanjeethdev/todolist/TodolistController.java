package com.sanjeethdev.todolist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodolistController {
    
    @RequestMapping("/")
    public String rootPage() {
        return "This is the root page.";
    }
}
