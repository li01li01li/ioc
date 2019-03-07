package com.spring.aop.moveproxy;


import com.spring.aop.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        Hello hello =context.getBean(Hello.class);
        System.out.println(hello.hello());
    }

}
