package collectionFramework.listImplmentations.customObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Course {
    private int id;
    private String name;
    private String description;
    private String duration;
    private int fees;
}
