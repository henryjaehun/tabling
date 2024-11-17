package com.example.tabling.dto;

import lombok.Data;

@Data
public class RestaurantSearchDto {
    // 가게 검색을 필요할 때 필요한 검색어들
    private String name;
    private String address;
}
