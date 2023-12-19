package com.db.shop.api.web;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.TimeZone;

/**
 * @Description PC端模块启动类
 * @Author db
 * @Date 2023/12/219 11:25
 * @Version 1.0.0
 * @Since 1.0.0
 */
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class, DataSourceAutoConfiguration.class})
@Slf4j
public class ApiWebApplication {
    public static void main(String []args){
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        SpringApplication.run(ApiWebApplication.class, args);
    }
}
