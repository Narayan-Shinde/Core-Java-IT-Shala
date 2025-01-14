package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class Course {
    private int id;
    private String name;
    private String description;
    private String duration;
    private int fees;
}
