package com.example.recommendLunch_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter @Setter
@Table(name = "restaurant")
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantEntity {

    @Id @GeneratedValue
    private Long id;

    private String restaurantName;
    private String explanation;
    private boolean orderable;

    private String naverId;
}
