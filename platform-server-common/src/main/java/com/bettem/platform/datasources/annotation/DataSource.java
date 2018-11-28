package com.bettem.platform.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 * @author 颜金星
 * @date 2018/11/28 22:16
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
