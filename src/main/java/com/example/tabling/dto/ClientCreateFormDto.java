package com.example.tabling.dto;

import lombok.Data;

@Data
public class ClientCreateFormDto {
    // 사용자 회원가입을 할때 필요한 정보들
    private String clientname;
    private String email;
    private String password;
    private String phone;
}
