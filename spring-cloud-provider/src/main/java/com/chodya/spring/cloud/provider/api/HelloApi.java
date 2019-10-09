package com.chodya.spring.cloud.provider.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cwt
 * @create by cwt on 2019-10-09 9:59
 */
@RestController
public class HelloApi {

    @GetMapping("hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "hello " + name;
    }

}
