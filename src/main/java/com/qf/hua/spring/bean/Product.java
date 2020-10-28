package com.qf.hua.spring.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Componet 作用 往容器中注册对象,在类上使用
 * value
 * - 给容器中bean指定名字 如果不指定则类名首字母小写
 * @Service 声明在Service层
 * @Repository 声明Dao层
 * @Controller 声明在控制层
 *
 * 三层架构以外的用@Componet,三层架构以内的用三层固定的注解
 */

//@Component里面的name默认类名首字母小写
//@Component
@Data
public class Product {
    private String name;
    private BigDecimal price;
}
