package com.alibaba.openfeign.server;


import com.alibaba.openfeign.hystrix.OpenFeignServerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos",fallback = OpenFeignServerImpl.class)
public interface OpenFeignServer {

    @GetMapping("/hello")
    String sayHello();
}
