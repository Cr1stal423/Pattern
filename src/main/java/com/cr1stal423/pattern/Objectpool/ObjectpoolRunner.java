package com.cr1stal423.pattern.Objectpool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Objectpool")
public class ObjectpoolRunner implements CommandLineRunner {
    private final ProductService productService;

    @Autowired
    public ObjectpoolRunner(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting Product Pool Example...");

        // Отримання продуктів з пулу
        Product product1 = productService.getProduct();
        Product product2 = productService.getProduct();

        System.out.println("Acquired Products:");
        System.out.println(product1);
        System.out.println(product2);

        // Повернення продуктів в пул
        productService.returnProduct(product1);
        productService.returnProduct(product2);

        System.out.println("Returned Products to Pool.");

        // Отримання продуктів з пулу після повернення
        Product product3 = productService.getProduct();
        Product product4 = productService.getProduct();

        System.out.println("Acquired Products After Return:");
        System.out.println(product3);
        System.out.println(product4);

        // Показуємо, що продукти знову отримані з пулу
        System.out.println("Final Products in Pool:");
        System.out.println(productService.getProduct());
        System.out.println(productService.getProduct());
    }
}
