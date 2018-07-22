package com.boot.demo.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("index execute......");
        return "index";
    }


}
