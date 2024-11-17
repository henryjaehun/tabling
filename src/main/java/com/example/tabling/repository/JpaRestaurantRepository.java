package com.example.tabling.repository;

import com.example.tabling.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaRestaurantRepository extends JpaRepository<Restaurant, Long> {

    // 데이터베이스의 매장을 검색하는 쿼리
    @Query("SELECT r FROM Restaurant r WHERE " +
            "(:name IS NULL OR r.name LIKE %:name%) AND " +
            "(:address IS NULL OR r.address LIKE %:address%)")
    List<Restaurant> SearchByNameAndAddress(String name, String address);
}
