package com.register.customer.resources;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "Olá mundo!";
    }
}
