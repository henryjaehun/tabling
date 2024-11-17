package com.example.tabling.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Client {
    // 각게를 사용하는 고객들의 정보
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id는 필수로 자동생성한다
    private Long id;

    private String clientname;

    private String password;

    // 핸드폰번호와 이메일은 중복이 없게 설정한다
    @Column(unique = true)
    private String phone;

    @Column(unique = true)
    private String email;

}
