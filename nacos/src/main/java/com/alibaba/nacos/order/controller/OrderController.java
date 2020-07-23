package com.alibaba.nacos.order.controller;


import com.alibaba.nacos.order.entity.Iorder;
import com.alibaba.nacos.order.service.AccountService;
import com.alibaba.nacos.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.concurrent.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tianbaoge
 * @since 2020-07-21
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @Autowired
    AccountService accountService;

    @PostMapping("/create")
    public String createOrder(BigDecimal money,Integer id){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.MICROSECONDS, new LinkedBlockingDeque<>(100), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        Iorder order = new Iorder();
        order.setCost(money);
        order.setName("新建订单");
        orderService.save(order);
        accountService.decrementMoney(money, id);
        order.setStatus(1);
        orderService.updateById(order);
        return "创建订单完成";

    }

}

