package com.koreait.day01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 2개이상 생성자 추가
@NoArgsConstructor // 빈생성자 추가
public class Multiparam {
    String id;
    String name;
    String email;
    int age;
}
