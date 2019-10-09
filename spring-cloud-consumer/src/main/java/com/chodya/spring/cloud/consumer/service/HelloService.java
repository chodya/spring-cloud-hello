package com.chodya.spring.cloud.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cwt
 * @create by cwt on 2019-10-09 10:04
 */
@FeignClient(value = "hello-provider", path = "/spring-cloud-hello/provider", fallback = HelloServiceFallBack.class)
public interface HelloService {

    @GetMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);

}
