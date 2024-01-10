package com.example._mysql_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConflictsController {

    @GetMapping("/Conflicts")
    public String getConflicts(){
        return "Getting conflicts";
    }



}
