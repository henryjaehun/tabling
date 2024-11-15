package com.example.tabling.controller;

import com.example.tabling.domain.Restaurant;
import com.example.tabling.dto.RestaurantFormDto;
import com.example.tabling.dto.RestaurantSearchDto;
import com.example.tabling.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @PostMapping("/register")
    public String createRestaurant(@RequestBody RestaurantFormDto restaurantFromDto) {
        Long id = restaurantService.registerRestaurant(restaurantFromDto);
        return id + "번 매장이 등록 되었습니다.";
    }

    @GetMapping("/search")
    public List<Restaurant> searchRestaurantByName
            (@RequestParam RestaurantSearchDto restaurantSearchDto) {
        return restaurantService.searchRestaurantByName(restaurantSearchDto);
    }
}
