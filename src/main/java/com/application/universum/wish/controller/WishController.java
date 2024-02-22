package com.application.universum.wish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishController {

    @GetMapping("/rest/wishes")
    public String getListOfWishes() {
        return "Universum is UpX!";
    }

    /*
    asdasdasd
     */

}
