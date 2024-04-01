package com.example.recommendLunch_back.controller;


import com.example.recommendLunch_back.dto.RestaurantDto;
import com.example.recommendLunch_back.entity.RestaurantEntity;
import com.example.recommendLunch_back.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

//    레스토랑 생성
    @PostMapping("/restaurants")
    public ResponseEntity<RestaurantEntity> create(@RequestBody RestaurantDto restaurantDto) {

        RestaurantEntity restaurant = restaurantService.create(restaurantDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(restaurant);
    }

//    전체 레스토랑 정보 가져오기
    @GetMapping("/restaurants")
    public ResponseEntity<List<RestaurantEntity>> showAllList() {

        List<RestaurantEntity> restaurantEntityList = restaurantService.showAll();

        return ResponseEntity.status(HttpStatus.OK).body(restaurantEntityList);
    }

//    id로 레스토랑 정보 가져오기
    @GetMapping("/restaurants/{id}")
    public ResponseEntity<RestaurantEntity> show(@PathVariable Long id) {

        RestaurantEntity restaurant = restaurantService.show(id);

        if (restaurant == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        return ResponseEntity.status(HttpStatus.OK).body(restaurant);
    }

}