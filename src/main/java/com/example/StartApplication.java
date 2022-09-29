package com.example;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@EnableDubbo
public class StartApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(StartApplication.class,args);
    }
}
