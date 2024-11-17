package com.example.tabling.controller;

import com.example.tabling.domain.Client;
import com.example.tabling.dto.ClientCreateFormDto;
import com.example.tabling.dto.LoginRequestDto;
import com.example.tabling.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    // 클라이언트의 데이터를 받아서 서비스 레이어 회원가입 메소드를실행 후 데이터베이스에 저장하고,
    // 생성된 클라이언트 ID를 포함한 성공 메시지를 반환
    @PostMapping("/signup")
    public String signup(@RequestBody ClientCreateFormDto clientCreateFormDto) {
        Client client = clientService.create(clientCreateFormDto);
        return "회원가입이 완료되었습니다. ID : " + client.getId();
    }

    //로그인
//    @PostMapping("/client/login")
//    public String login(@RequestBody LoginRequestDto loginRequest) {
//        //구현할것
//    }
}
