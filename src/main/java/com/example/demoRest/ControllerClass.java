package com.example.demoRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
    @GetMapping(value = "/test")
    public String demo(){
        return "yes i m getting the response";
    }
}
