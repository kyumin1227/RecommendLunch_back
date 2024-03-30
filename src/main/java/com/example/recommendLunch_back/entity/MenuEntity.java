package com.example.recommendLunch_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "menu")
@Getter @Setter
public class MenuEntity {

    @Id @GeneratedValue
    private Long id;

    private String menuName;
    private int price;
    private boolean orderable;
}
