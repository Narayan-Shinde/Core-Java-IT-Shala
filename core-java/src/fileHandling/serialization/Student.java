package fileHandling.serialization;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class Student implements Serializable {
    private int id;
    private String username;
    transient private String password;

}
