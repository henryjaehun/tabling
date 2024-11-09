package com.example.tabling.dto;

import lombok.Data;

@Data
public class ClientCreateFormDto {
    private String clientname;
    private String email;
    private String password;
    private String phone;
}
