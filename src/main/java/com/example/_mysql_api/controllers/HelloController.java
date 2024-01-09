package com.example._mysql_api.controllers;

import org.springframework.web.bind.annotation.*;

@RestController

public class HelloController {

    @GetMapping("/Hello")
    public String getHello() {
        return "Hello Linus";

    }



}
