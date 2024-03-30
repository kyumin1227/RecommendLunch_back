package com.example.recommendLunch_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_table")
@Getter @Setter
@RequiredArgsConstructor
public class OrderEntity {

    @Id @GeneratedValue
    private Long id;

    private OrderEnum status;
}
