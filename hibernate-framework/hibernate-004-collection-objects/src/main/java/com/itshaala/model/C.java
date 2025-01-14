package com.itshaala.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@DiscriminatorValue("C type object")
public class C extends B {
    int m;
    int n;
    int o;
}
