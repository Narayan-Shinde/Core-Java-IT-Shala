package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class XMlWay {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.cfg.xml");
        Employee employee =context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
