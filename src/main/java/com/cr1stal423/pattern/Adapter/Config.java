package com.cr1stal423.pattern.Adapter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public OldProduct oldProduct() {
        return new OldProduct("Old Tech Product", 50);
    }

    @Bean(name = "adapterProduct")
    public Product productA(OldProduct oldProduct) {
        return new ProductAdapter(oldProduct);
    }

    @Bean
    public ProductService productServiceA() {
        return new ProductService();
    }
}