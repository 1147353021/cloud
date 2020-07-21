package com.alibaba.nacos.order.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient("consumer")
public interface AccountService {

    @PostMapping("/account/decrementMoney")
    public boolean decrementMoney(@RequestParam("money") BigDecimal money, @RequestParam("id") Integer id);

}
