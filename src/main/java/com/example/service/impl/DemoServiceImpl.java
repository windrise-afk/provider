package com.example.service.impl;


import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import service.DemoService;

@Component
@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name){
        return "Hello" + name;
    }
}
