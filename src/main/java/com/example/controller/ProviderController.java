package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.service.impl.DemoServiceImpl;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/nihao")
public class ProviderController {
    @Autowired
    DemoServiceImpl demoService;
    @ResponseBody
    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("nihao");
        return demoService.sayHello("cqy");
    }
    @ResponseBody
    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
