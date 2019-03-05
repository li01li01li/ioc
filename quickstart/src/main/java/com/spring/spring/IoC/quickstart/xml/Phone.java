package com.spring.IoC.quickstart.xml;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**/
@Component
@Data
public class Phone {
    @Value("iPhone")
    private String brand;
    @Value("666.66")
    private double price;

}
