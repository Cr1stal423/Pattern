package com.cr1stal423.pattern.AbstractFactory;

import com.cr1stal423.pattern.AbstractFactory.apple.AppleFactory;
import com.cr1stal423.pattern.AbstractFactory.samsung.SamsungFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class AbstractProductFactoryConfig {
    @Bean
    @Scope("prototype")
    public ProductFactory appleFactory(){
        return new AppleFactory();
    }

    @Bean
    @Scope("prototype")
    public ProductFactory samsungFactory(){
        return new SamsungFactory();
    }
}
