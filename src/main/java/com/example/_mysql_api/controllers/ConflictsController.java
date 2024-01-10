package com.example._mysql_api.controllers;

import org.springframework.web.bind.annotation.*;

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

@PatchMapping("/conflicts")
    public String patchConlicts(){
        return "Patching conflicts";
@PutMapping("/conflicts")
    public String putConflicts(){
        return "Putting conflicts";
}

}

}

