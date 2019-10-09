package com.chodya.spring.cloud.consumer.api;

import com.chodya.spring.cloud.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cwt
 * @create by cwt on 2019-10-09 9:59
 */
@RestController
@RequestMapping("api/v1")
public class HelloWorldApi {

    @Autowired
    private HelloService helloService;

    @GetMapping("hello/{name}")
    public String hello(@PathVariable("name") String name){
        return helloService.hello(name);
    }

}
