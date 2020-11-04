package com.koreait.day01.controller;

import com.koreait.day01.model.Multiparam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {
    // localhost:9090/api/postMethod
    @PostMapping(value = "/postMethod")
    public Multiparam postMethod(@RequestBody Multiparam multiparam){

        return multiparam;
    }

    @PutMapping("/putMethod")
    public void put(){

    }

    @PatchMapping("/patchMethod")
    public void patch(){

    }

    @DeleteMapping("/deleteMthod")
    public void delete(){

    }
}
