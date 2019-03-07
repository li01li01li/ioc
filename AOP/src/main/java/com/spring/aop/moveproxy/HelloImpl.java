package com.spring.aop.moveproxy;


import com.spring.aop.Hello;

public class HelloImpl implements Hello {

    @Override
    public String hello() {
        return "Hello,Spring AOP";
    }
}

