package com.itshaala.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class Course {
    private int id;
    private String name;
    private String description;
}
