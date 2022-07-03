package com.itheima.reggie.config;

/**
 * @author Hide on bush
 * @date 2022/6/26 - 17:05
 */

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置 MyBatisPlus 的分页插件
 */
@Configuration
public class MyBatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor myBatisPlusInterceptor = new MybatisPlusInterceptor();
        myBatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return myBatisPlusInterceptor;
    }
}
