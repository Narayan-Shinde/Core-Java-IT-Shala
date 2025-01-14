package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@DiscriminatorValue("B type object")
public class B extends A {
    int p;
    int q;
    int r;
}
