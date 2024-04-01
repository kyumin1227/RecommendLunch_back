package com.example.recommendLunch_back.dto;

import com.example.recommendLunch_back.entity.RestaurantEntity;
import lombok.Getter;

@Getter
public class RestaurantDto {

    private Long id;
    private String restaurantName;
    private String explanation;

    public RestaurantEntity toEntity() {
        return new RestaurantEntity(id, restaurantName, explanation, false, null);
    }
}
