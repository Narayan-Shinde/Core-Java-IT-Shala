package com.itshaala;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.itshaala"})
public class SpringConfiguration {
    public SpringConfiguration(){
        System.out.println("configuration class con");
    }

    /*@Bean
    public Student student() {
        //return new Student();
        return Student.builder()
                .id(1)
                .name("Arti")
                .age(22)
                .address("Nagpur")
                .build();
    }*/
}
