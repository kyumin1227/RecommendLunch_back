package com.example.recommendLunch_back.repository;

import com.example.recommendLunch_back.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuEntity, Long> {
}
