package com.example.recommendLunch_back.repository;

import com.example.recommendLunch_back.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
}
