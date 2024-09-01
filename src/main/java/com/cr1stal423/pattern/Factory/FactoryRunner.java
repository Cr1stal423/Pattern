package com.cr1stal423.pattern.Factory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("factory")
public class FactoryRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProductFactoryConfig.class);

       ProducrFactory smartphoneFactory = context.getBean("smartphoneFactory", ProducrFactory.class);
       Product smartphone = smartphoneFactory.createProduct();
       smartphone.create();

       ProducrFactory laptopFactory = context.getBean("laptopFactory", ProducrFactory.class);
       Product laptop = laptopFactory.createProduct();
       laptop.create();
    }

}
