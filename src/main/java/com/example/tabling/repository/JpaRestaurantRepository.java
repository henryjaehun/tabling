package com.example.tabling.repository;

import com.example.tabling.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaRestaurantRepository extends JpaRepository<Restaurant, Long> {
    @Query("SELECT r FROM Restaurant r WHERE " +
            "(:name IS NULL OR r.name LIKE %:name%) AND " +
            "(:address IS NULL OR r.address LIKE %:address%)")
    List<Restaurant> SearchByNameAndAddress(String name, String address);
}
