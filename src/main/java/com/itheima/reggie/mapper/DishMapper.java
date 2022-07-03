package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Hide on bush
 * @date 2022/6/27 - 17:22
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
