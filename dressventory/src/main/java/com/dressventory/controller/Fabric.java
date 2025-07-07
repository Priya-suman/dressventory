package com.dressventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fabric {

    @RequestMapping("/")
    public String test(){
        return "lets have a meeting with my passion and profession :):)";
    }
}
