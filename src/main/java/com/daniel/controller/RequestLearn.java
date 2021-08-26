package com.daniel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestLearn {
    @RequestMapping("/test1")
    public String testReturnData(){
        return "Hello World";
    }
}
