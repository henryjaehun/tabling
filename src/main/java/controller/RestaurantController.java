package controller;

import dto.RestaurantFormDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.RestaurantService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @PostMapping("/register")
    public String createRestaurant(@RequestBody RestaurantFormDto restaurantFromDto) {
        Long id = restaurantService.registerRestaurant(restaurantFromDto);
        return "Restaurant created: " + id;
    }

}
