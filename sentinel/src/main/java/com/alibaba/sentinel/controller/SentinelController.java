package com.alibaba.sentinel.controller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {


    @GetMapping("/hello")
    @SentinelResource(value = "hello")
    public String hello(){

        return "hello word";

    }


    @GetMapping("/url")
    public String sayGoodBay(){
        return "good Bay";
    }


}
