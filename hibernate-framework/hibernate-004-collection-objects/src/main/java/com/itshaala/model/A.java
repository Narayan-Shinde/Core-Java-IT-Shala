package com.itshaala.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "A")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "object_type")
@DiscriminatorValue("A type object")
public class A {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int x;
    int y;
    int z;

}
