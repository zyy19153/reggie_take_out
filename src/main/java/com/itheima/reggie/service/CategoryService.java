package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/**
 * @author Hide on bush
 * @date 2022/6/27 - 16:32
 */
public interface CategoryService extends IService<Category> {
    void remove(Long id);
}
