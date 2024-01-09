package com.example._mysql_api.controllers;

import org.springframework.web.bind.annotation.*;
@RestController
public class NamesController {



    @GetMapping("/names")
    public String getName() {
        return "Your name is linus";

    }

    @PostMapping("/names")
    public String postName(@RequestBody String name) {
        return "Posting your name " + name;
    }

    @PutMapping("/names")
    public String putName() {
        return "Updating your name!";
    }

    @DeleteMapping("/names")
    public String deleteName(){
        return "delete name";

    }
}
