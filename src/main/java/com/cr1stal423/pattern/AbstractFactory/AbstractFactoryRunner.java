package com.cr1stal423.pattern.AbstractFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("abstractFactory")
public class AbstractFactoryRunner implements org.springframework.boot.CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(AbstractProductFactoryConfig.class);

        ProductFactory appleProductFactory = context.getBean("appleFactory", ProductFactory.class);
        Smartphone appleSmartphone = appleProductFactory.createSmartphone();
        Laptope appleLaptop = appleProductFactory.createLaptop();

        appleSmartphone.createSmartphone();
        appleLaptop.createLaptop();


        ProductFactory samsungProductFactory = context.getBean("samsungFactory", ProductFactory.class);
        Smartphone samsungSmartphone = samsungProductFactory.createSmartphone();
        Laptope samsungLaptope = samsungProductFactory.createLaptop();
        samsungLaptope.createLaptop();
        samsungSmartphone.createSmartphone();
    }
}
