package com.alibaba.consumer.account.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author tianbaoge
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Account implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 账户表id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账号余额
     */
    private BigDecimal money;

    /**
     * 账户名
     */
    private String username;


}
