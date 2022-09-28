package service.impl;


import service.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name){
        return "Hello" + name;
    }
}
