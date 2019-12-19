package com.example.myserviceunit.service;

import org.springframework.stereotype.Service;

@Service
public class AddService {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
