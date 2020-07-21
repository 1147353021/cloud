package com.alibaba.nacos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.alibaba.nacos.order.mapper")
public class NacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosApplication.class, args);
    }

}
