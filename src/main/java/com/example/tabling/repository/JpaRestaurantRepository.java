package com.example.tabling.repository;

import com.example.tabling.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRestaurantRepository extends JpaRepository<Restaurant, Long> {

}
