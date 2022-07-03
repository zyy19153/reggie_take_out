package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Hide on bush
 * @date 2022/6/29 - 15:56
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
