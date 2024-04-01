package com.example.recommendLunch_back.service;

import com.example.recommendLunch_back.dto.RestaurantDto;
import com.example.recommendLunch_back.entity.RestaurantEntity;
import com.example.recommendLunch_back.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<RestaurantEntity> showAll() {
        List<RestaurantEntity> findAll = restaurantRepository.findAll();
        return findAll;
    }

    public RestaurantEntity show(Long id) {
        RestaurantEntity findOne = restaurantRepository.findById(id).orElse(null);
        return findOne;
    }
}
