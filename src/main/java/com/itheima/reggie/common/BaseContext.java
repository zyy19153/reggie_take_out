package com.itheima.reggie.common;

/**
 * 基于 ThreadLocal 封装的工具类，用于保存和获取当前登录用户的 id
 * @author Hide on bush
 * @date 2022/6/27 - 16:11
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置 值
     */
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * 获取 值
     */
    public static Long getCurrentId() {
        return threadLocal.get();
    }
}
