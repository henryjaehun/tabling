package com.example.tabling.dto;

import lombok.Data;

@Data
public class RestaurantFormDto {
    // 업주가 가게를 등록할때 필요한 폼
    private String name;
    private String address;
    private String information;
}
