package com.example.recommendLunch_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class RestaurantEntity {

    @Id @GeneratedValue
    private Long id;

    private String RestaurantName;
}
