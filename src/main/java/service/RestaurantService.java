package service;

import domain.Restaurant;
import dto.RestaurantFormDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import repository.JpaRestaurantRepository;

@Service
@AllArgsConstructor
public class RestaurantService {

    private final JpaRestaurantRepository jpaRestaurantRepository;

    //파트너 가게 등록 기능
    public Long registerRestaurant(RestaurantFormDto restaurantFormDto) {
        Restaurant restaurant = Restaurant.builder()
    }

}
