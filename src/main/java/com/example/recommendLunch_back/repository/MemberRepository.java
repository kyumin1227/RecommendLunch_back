package com.example.recommendLunch_back.repository;

import com.example.recommendLunch_back.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
