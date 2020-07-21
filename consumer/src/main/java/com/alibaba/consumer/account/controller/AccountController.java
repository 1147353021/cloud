package com.alibaba.consumer.account.controller;


import com.alibaba.consumer.account.entity.Account;
import com.alibaba.consumer.account.service.IAccountService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tianbaoge
 * @since 2020-07-21
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    IAccountService accountService;

    @PostMapping("/decrementMoney")
    public boolean decrementMoney(BigDecimal money,Integer id){
        Account account = accountService.getOne(new QueryWrapper<Account>().eq("id", id));
        account.setMoney(account.getMoney().subtract(money));
        boolean update = accountService.updateById(account);
        return update;
    };

}

