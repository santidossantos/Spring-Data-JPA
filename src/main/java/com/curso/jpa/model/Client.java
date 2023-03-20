package com.curso.jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @SequenceGenerator(
            name = "client_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "client_sequence"
    )
    private Long id;
    private String name;
    private Boolean active;
    private Timestamp createdAt;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    private String password;

}
