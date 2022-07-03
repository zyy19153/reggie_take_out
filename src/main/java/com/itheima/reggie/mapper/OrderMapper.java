package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Hide on bush
 * @date 2022/6/30 - 18:32
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
