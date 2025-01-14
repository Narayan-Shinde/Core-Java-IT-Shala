package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.cfg.xml");
        // Employee emp = new Employee(1,"Satish",23,69990);
        Employee employee = context.getBean("employeeRef", Employee.class);
        Employee employee2 = context.getBean("employeeRef", Employee.class);
        System.out.println(employee+"\t"+System.identityHashCode(employee));
        System.out.println(employee2+"\t"+System.identityHashCode(employee2));

    }
}
