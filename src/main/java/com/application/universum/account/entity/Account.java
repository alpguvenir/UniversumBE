package com.application.universum.account.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Name;
    // Refer to the documentation: https://www.baeldung.com/hibernate-notnull-vs-nullable
    //@Column(nullable = false)
    @NotBlank(message = "Email cannot be left empty")
    private String EmailAddress;
    private String Address;
    private int Age;

}
