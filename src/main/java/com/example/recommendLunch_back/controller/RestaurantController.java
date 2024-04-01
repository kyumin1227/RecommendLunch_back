package com.example.recommendLunch_back.controller;


import com.example.recommendLunch_back.dto.RestaurantDto;
import com.example.recommendLunch_back.entity.RestaurantEntity;
import com.example.recommendLunch_back.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @PostMapping("/restaurant")
    public ResponseEntity<RestaurantEntity> create(@RequestBody RestaurantDto restaurantDto) {

        System.out.println(restaurantDto.getRestaurantName());

        RestaurantEntity restaurant = restaurantService.create(restaurantDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(restaurant);
    }

}
