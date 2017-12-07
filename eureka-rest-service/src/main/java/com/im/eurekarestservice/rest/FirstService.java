package com.im.eurekarestservice.rest;

import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/hello")
public class FirstService {

    public String greet() {
        return "Hello people!";
    }
}
