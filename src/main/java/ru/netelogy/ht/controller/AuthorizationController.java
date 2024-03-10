package ru.netelogy.ht.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {

    @GetMapping("/authorize")
    public String authorize() {
        return "Authorization successful!";
    }
}