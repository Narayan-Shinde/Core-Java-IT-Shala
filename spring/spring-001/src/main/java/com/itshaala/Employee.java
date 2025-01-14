package com.itshaala;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
}
