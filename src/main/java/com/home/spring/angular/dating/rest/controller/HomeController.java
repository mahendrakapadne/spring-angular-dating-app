package com.home.spring.angular.dating.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    private final Logger log = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/users")
    public String getMessage(@RequestParam String name) {
        return "Welcome, " + name;
    }
}
