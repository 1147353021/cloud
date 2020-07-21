package com.alibaba.consumer.account.service.impl;


import com.alibaba.consumer.account.entity.Account;
import com.alibaba.consumer.account.mapper.AccountMapper;
import com.alibaba.consumer.account.service.IAccountService;
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
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
