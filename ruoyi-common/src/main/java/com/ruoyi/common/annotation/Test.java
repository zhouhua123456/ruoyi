package com.ruoyi.common.annotation;

import java.lang.annotation.*;

/**
 * 测试自定义注解
 * 其实注解只是打了一个标记，用于aop去寻找切点
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Test {
    public String name();
}
