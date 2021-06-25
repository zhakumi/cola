package com.wangcan.adapter.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wangcan
 * @Date: 2021/6/25 10:55
 */
@Configuration
public class AppConfig {

    @Bean
    public ClassA classA() {
        return new ClassA();
    }

}
