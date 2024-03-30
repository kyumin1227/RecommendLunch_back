package com.example.recommendLunch_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class MemberEntity {

    @Id @GeneratedValue
    private long id;

    private String phone;
    private String name;
    private String email;
    private String password;
}
