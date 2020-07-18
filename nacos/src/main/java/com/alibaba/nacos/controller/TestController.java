package com.alibaba.nacos.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${hello.world}")
    private String str;

    @GetMapping("/hello")
    public String sayHello(){
        return str;
    }


}
