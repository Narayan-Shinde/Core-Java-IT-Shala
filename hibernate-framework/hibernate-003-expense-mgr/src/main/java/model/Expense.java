package model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "expense_tbl")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "expense_id")
    private UUID id;

    @Column(name = "expense_date")
    private LocalDate date;

    @Column(name = "expense_title")
    private String title;

    @Column(name = "expense_amount")
    private double amount;

    @Column(name = "expense_description")
    private String description;

}
