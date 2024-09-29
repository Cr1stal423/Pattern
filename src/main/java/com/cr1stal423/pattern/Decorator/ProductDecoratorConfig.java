package com.cr1stal423.pattern.Decorator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductDecoratorConfig {
    @Bean
    public IProductService productServiceDecorator() {
        IProductService productServiceDecorator = new LaptopProductService();

        productServiceDecorator = new PackagingDecorator(productServiceDecorator);
        productServiceDecorator = new DeliveryDecorator(productServiceDecorator);

        return productServiceDecorator;
    }
}
