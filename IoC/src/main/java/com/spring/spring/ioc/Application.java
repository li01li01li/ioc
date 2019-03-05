package com.spring.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        ApplicationContext context =new
                ClassPathXmlApplicationContext("beans.xml");
        MessagePrinter printer =context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
