package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class MyController {

    // Первый эндпоинт: возвращает текст
    @GetMapping("/hello")
    public String sayHello() {
        return "Привет! Это мой первый Spring Boot проект.";
    }

    // Второй эндпоинт: возвращает числа
    @GetMapping("/numbers")
    public List<Integer> getNumbers() {
        return Arrays.asList(1, 2, 3, 4, 5);
    }
}