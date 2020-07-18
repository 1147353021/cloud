package com.alibaba.openfeign.controller;


import com.alibaba.openfeign.server.OpenFeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private OpenFeignServer openFeignServer;

    @GetMapping("/feign/hello")
    public String sayHello(){

        return openFeignServer.sayHello();

    }

}
