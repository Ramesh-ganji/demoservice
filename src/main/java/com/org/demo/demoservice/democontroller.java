package com.org.demo.demoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class democontroller {

    @GetMapping("/demo")
    public String helloDemo(){
        return "Hello World Demo Project";
    }
}
