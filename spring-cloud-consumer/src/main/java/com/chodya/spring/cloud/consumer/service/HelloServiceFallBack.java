package com.chodya.spring.cloud.consumer.service;

import org.springframework.stereotype.Component;

/**
 * @author cwt
 * @create by cwt on 2019-10-09 11:04
 */
@Component
public class HelloServiceFallBack implements HelloService {

    @Override
    public String hello(String name) {
        return "hello 服务不可用！";
    }
}
