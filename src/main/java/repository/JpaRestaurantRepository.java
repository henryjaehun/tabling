package repository;

import domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaRestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> registerRestaurant(String name);


}
