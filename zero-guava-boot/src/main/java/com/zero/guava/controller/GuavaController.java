package com.zero.guava.controller;

import com.zero.guava.service.GuavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guava")
public class GuavaController {

    GuavaService guavaService;

    @Autowired
    public GuavaController(GuavaService guavaService) {
        this.guavaService = guavaService;
    }

    @RequestMapping("/test")
    public String test() {
        return "guava test";
    }

}
