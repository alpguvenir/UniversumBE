package com.application.universum.wish.service;

import com.application.universum.wish.repository.WishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishService {
    @Autowired
    private WishRepository wishRepository;

}
