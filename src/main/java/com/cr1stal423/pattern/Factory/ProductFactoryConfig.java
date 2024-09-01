package com.cr1stal423.pattern.Factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProductFactoryConfig {
    @Bean
    @Scope("prototype")
    public ProducrFactory smartphoneFactory(){
        return new SmartphoneFactory();
    }
    @Bean
    @Scope("prototype")
    public ProducrFactory laptopFactory(){
        return new LaptonFactory();
    }
}
