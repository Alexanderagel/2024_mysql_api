package com.example._mysql_api.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConflictsController {

    @GetMapping("/Conflicts")
    public String getConflicts(){
        return "Getting conflicts";
    }

@PostMapping("/conflicts")
    public String postConflicts(){
        return "Pos" +
                "deleting conflicts";

    }
@DeleteMapping("/Conflicts")
    public String deleteConflicts(){
        return "Deleting conflicts";
}

}
