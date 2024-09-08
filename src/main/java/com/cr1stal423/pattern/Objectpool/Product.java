package com.cr1stal423.pattern.Objectpool;


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
public class Product {
    private Integer id;
    private String name;
    private Integer quantity;

    public Product(Integer id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

}
