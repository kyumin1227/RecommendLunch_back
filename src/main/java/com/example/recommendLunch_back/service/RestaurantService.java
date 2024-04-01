package com.example.recommendLunch_back.service;

import com.example.recommendLunch_back.dto.RestaurantDto;
import com.example.recommendLunch_back.entity.RestaurantEntity;
import com.example.recommendLunch_back.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public RestaurantEntity create(RestaurantDto dto) {
        RestaurantEntity restaurant = dto.toEntity();
        System.out.println(restaurant.getRestaurantName());
        RestaurantEntity saved = restaurantRepository.save(restaurant);
        return saved;
    }
}
