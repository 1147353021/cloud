package com.alibaba.hellotest.controller;

import com.alibaba.bean.HelloBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloBean helloBean;

    @GetMapping("/hello")
    public String sayHello(){

        return helloBean.sayHello();

    }

}
