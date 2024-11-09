package com.example.tabling.controller;

import com.example.tabling.domain.Client;
import com.example.tabling.dto.ClientCreateFormDto;
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

    @PostMapping("/signup")
    public String signup(@RequestBody ClientCreateFormDto clientCreateFormDto) {
        Client client = clientService.create(clientCreateFormDto);
        return "회원가입이 완료되었습니다. ID : " + client.getId();
    }
}
