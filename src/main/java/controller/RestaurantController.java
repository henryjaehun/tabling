package controller;

import dto.RestaurantFormDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import service.RestaurantService;

@RestController
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @PostMapping("restaurant/register")
    public String createRestaurant() {
        Long id = restaurantService.registerRestaurant(new RestaurantFormDto());
        return "Restaurant created: " + id;
    }

}
