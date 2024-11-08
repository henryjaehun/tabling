package com.example.tabling.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientname;

    private String password;

    @Column(unique = true)
    private String phone;

    @Column(unique = true)
    private String email;

}
