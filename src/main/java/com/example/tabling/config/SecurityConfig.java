package com.example.tabling.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
//                .authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests
//                        .requestMatchers("/client/signup").permitAll() // /client/signup 경로는 인증 없이 접근 허용
//                        .requestMatchers("/restaurant/**", "/search").permitAll()
//                        .anyRequest().authenticated()) // 다른 경로는 인증 요구
//                .csrf().disable(); // CSRF 비활성화 (테스트 시에만)
                .authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests
                        .anyRequest().permitAll()) // 모든 요청 인증 없이 허용
                .csrf().disable(); // CSRF 비활성화 (테스트 환경에서만 권장)

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
