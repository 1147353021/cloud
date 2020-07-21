package com.alibaba.nacos.order.service.impl;

import com.alibaba.nacos.order.entity.Iorder;
import com.alibaba.nacos.order.mapper.OrderMapper;
import com.alibaba.nacos.order.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tianbaoge
 * @since 2020-07-21
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Iorder> implements IOrderService {

}
