package com.wangcan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot Starter
 *
 * @author Frank Zhang
 */
@SpringBootApplication
@ComponentScan({"com.wangcan", "com.alibaba.cola"})
@MapperScan("com.wangcan.**.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
