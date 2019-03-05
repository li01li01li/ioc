package com.spring.IoC.quickstart.xml;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*采用注解和lombok开发的Phone类*/
@Component
@Data
public class Student {

    @Value("Tom")
    private String name;
    @Value("20")
    private int age;
    @Autowired
    private Phone phone;
}
