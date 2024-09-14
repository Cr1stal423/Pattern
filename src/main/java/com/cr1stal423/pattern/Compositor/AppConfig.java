package com.cr1stal423.pattern.Compositor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("singleton")
    public Product laptop(){
        return new Product("Laptop",1000);
    }

    @Bean
    @Scope("singleton")
    public Product smartphone(){
        return new Product("smartphone", 600);
    }

    @Bean
    @Scope("singleton")
    public Category computers (){
        Category category = new Category("Computers");
        category.addComponent(laptop());
        return category;
    }

    @Bean
    @Scope("singleton")
    public Category electronics(){
        Category category = new Category("Electronics");
        category.addComponent(smartphone());
        category.addComponent(computers());
        return category;
    }


}
