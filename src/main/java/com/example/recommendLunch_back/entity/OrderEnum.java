package com.example.recommendLunch_back.entity;

public enum OrderEnum {
    Order,  // 주문
    Cancel, // 가게에서 주문 취소
    Confirm, // 가게에서 주문 수락
    Complete // 주문 수락 후 일정 시간 흐름
}
