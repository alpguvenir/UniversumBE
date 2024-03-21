package com.application.universum.wish.controller;

import com.application.universum.wish.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishController {

    @Autowired
    private WishService wishService;

    @GetMapping("/rest/wishes")
    public String getListOfWishes() {
        return "Universum is UpX!";
    }

}
