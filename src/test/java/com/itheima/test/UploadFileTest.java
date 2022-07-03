package com.itheima.test;

import org.junit.jupiter.api.Test;

/**
 * @author Hide on bush
 * @date 2022/6/28 - 10:38
 */
public class UploadFileTest {
    @Test
    public void test1() {
        String fileName = "qeqeqwe.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }
}
