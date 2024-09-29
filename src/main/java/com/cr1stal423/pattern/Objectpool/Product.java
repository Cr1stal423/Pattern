package com.cr1stal423.pattern.Objectpool;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
@Getter
@Service
@ToString
@AllArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private Integer quantity;



}
