package com.itshaala;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Course course = Course.builder()
                .id(101)
                .name("maven")
                .description("learn build tool")
                .duration("2 hours")
                .fees(100)
                .build();
        System.out.println(course);
    }
}
