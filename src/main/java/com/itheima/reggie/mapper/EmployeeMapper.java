package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Hide on bush
 * @date 2022/6/25 - 16:59
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
