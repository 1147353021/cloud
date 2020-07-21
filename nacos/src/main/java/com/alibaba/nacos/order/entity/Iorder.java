package com.alibaba.nacos.order.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class Iorder implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 订单表id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单名称
     */
    private String name;

    /**
     * 订单金额
     */
    private BigDecimal cost;

    /**
     * 订单状态，0为创建中，1为创建成功
     */
    private Integer status;


}
