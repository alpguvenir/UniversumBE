package com.application.universum.wish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishController {

    @GetMapping("/x")
    public String index() {
        return "Universum is UpX!";
    }

    /*
    asdasdasd
     */

}
