package com.example.recommendLunch_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

@Entity
public class TestEntity {

    @Id @GeneratedValue
    private Long id;

    private String text;
}
