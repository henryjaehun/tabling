package com.example.tabling.service;

import com.example.tabling.domain.Restaurant;
import com.example.tabling.dto.RestaurantFormDto;
import com.example.tabling.dto.RestaurantSearchDto;
import com.example.tabling.repository.JpaRestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RestaurantService {

    private final JpaRestaurantRepository jpaRestaurantRepository;

    //파트너 가게 등록 기능
    // registerRestaurant 메소드는 dto를 인자로 받아서 이름,주소,정보를 입력하고 등록하면 id를 가입및 생성해준다.
    public Long registerRestaurant(RestaurantFormDto restaurantFormDto) {
        Restaurant restaurant = Restaurant.builder()
                .name(restaurantFormDto.getName())
                .address(restaurantFormDto.getAddress())
                .information(restaurantFormDto.getInformation())
                .build();
        return jpaRestaurantRepository.save(restaurant).getId();
        // jpa를 통해 restaurant 데이터베이스에 저장된다.
    }

    //파트너 가게 삭제
    public void deleteRestaurant(String name) {
        jpaRestaurantRepository.deleteByName(name);
    }
    // 파트너 가게 조회


    // 가게 정보 수정



    // 이름으로 가게 검색
    public List<Restaurant> searchRestaurantByName(RestaurantSearchDto restaurantSearchDto) {
        return jpaRestaurantRepository.SearchByNameAndAddress(
                restaurantSearchDto.getName(),
                restaurantSearchDto.getAddress()
        );
    }

}
