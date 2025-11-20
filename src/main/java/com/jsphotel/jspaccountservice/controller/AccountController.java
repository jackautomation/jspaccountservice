package com.jsphotel.jspaccountservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class AccountController {

    @PostMapping("/creation")
    public ResponseEntity<String> accountCreation(){
        System.out.println("Account creation Successfully! ");
        return ResponseEntity.ok("Account Creation Successfully");
    }


}
