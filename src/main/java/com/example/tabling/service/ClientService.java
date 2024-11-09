package com.example.tabling.service;

import com.example.tabling.domain.Client;
import com.example.tabling.dto.ClientCreateFormDto;
import com.example.tabling.repository.JpaClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final JpaClientRepository jpaClientRepository;
    private final PasswordEncoder passwordEncoder;

    // 매장 검색 밑 조회
    // 이용자 회원가입
    public Client create(ClientCreateFormDto clientCreateFormDto) {
        Client client = new Client();
        client.setClientname(clientCreateFormDto.getClientname());
        client.setPhone(clientCreateFormDto.getPhone());
        client.setEmail(clientCreateFormDto.getEmail());
        // 비밀번호는 보안을 위하여 BCryptPasswordEncoder 클래스를 사용해서 암호화하여 저장하도록 한다.
        client.setPassword(passwordEncoder.encode(clientCreateFormDto.getPassword()));
        return jpaClientRepository.save(client);
    }


    // 매장 예약


    // 리뷰등록


}
