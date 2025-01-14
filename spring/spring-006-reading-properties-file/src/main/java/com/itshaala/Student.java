package com.itshaala;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
@Component
@PropertySource("classpath:application.properties")
public class Student {
   // @Value("101")
    @Value("${student.id}")
    private  int id;

    //@Value("Ashish")
    @Value("${student.name}")
    private String name;

    //@Value("25")
    @Value("${student.age}")
    private int age;

    //@Value("Katraj")
    @Value("${student.address}")
    private String address;
}
