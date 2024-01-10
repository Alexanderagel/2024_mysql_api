package com.example._mysql_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
git    public String getTest() {
        return "This is a test to test the controller";


    }
}


