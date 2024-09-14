package com.cr1stal423.pattern.Adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("adapter")
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ProductService productService = context.getBean(ProductService.class);
        Product product = context.getBean(Product.class);

        productService.displayProductInfo(product);

        context.close();
    }
}

