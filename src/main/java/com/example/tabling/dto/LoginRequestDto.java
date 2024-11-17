package com.example.tabling.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
    // 로그인시 입력해야할 사항들
    private String email;
    private String password;
}