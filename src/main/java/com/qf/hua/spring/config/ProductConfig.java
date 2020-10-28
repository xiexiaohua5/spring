package com.qf.hua.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.qf.hua.spring.bean.Product;
import com.qf.hua.spring.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* @Configuration
* 当没有xml方式，又要初始化第三方的配置时
* 就需要使用javaConfig方式
* 第一步：先使用@Configuration注解
* 第二步：
* */
@Configuration
public class ProductConfig {
    @Bean
    public Product product(){
        Product product = new Product();
        product.setName("test");
        return product;
    }
}
