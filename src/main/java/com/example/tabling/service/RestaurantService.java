package com.example.tabling.service;

import com.example.tabling.domain.Restaurant;
import com.example.tabling.dto.RestaurantFormDto;
import com.example.tabling.repository.JpaRestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RestaurantService {

    private final JpaRestaurantRepository jpaRestaurantRepository;

    //파트너 가게 등록 기능
    public Long registerRestaurant(RestaurantFormDto restaurantFormDto) {
        Restaurant restaurant = Restaurant.builder()
                .name(restaurantFormDto.getName())
                .address(restaurantFormDto.getAddress())
                .information(restaurantFormDto.getInformation())
                .build();
        return jpaRestaurantRepository.save(restaurant).getId();
    }

}
