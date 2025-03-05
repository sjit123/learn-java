package com.example.myfirstspringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // This tells Spring that this class is a REST Controller
@RequestMapping("/hello") // This sets the base path for all endpoints in this controller to "/hello"
public class HelloController {

    @GetMapping
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) { // Added @RequestParam and parameter
        return "Hello, " + name + "!"; // Personalized greeting
    }
}