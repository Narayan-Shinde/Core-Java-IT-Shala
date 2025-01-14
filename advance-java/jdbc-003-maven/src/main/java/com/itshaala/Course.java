package com.itshaala;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Course {
    private int id;
    private String name;
    private String description;
    private String duration;
    private int fees;

}
