package com.alibaba.openfeign.hystrix;

import com.alibaba.openfeign.server.OpenFeignServer;
import org.springframework.stereotype.Component;

@Component
public class OpenFeignServerImpl implements OpenFeignServer {
    @Override
    public String sayHello() {
        return "error from hystrix";
    }
}
