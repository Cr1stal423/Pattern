package com.cr1stal423.pattern.Factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public abstract class ProducrFactory {
    public abstract Product createProduct();
}
