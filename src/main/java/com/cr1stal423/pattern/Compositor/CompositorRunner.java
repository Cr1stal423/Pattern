package com.cr1stal423.pattern.Compositor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("compositor")
public class CompositorRunner implements CommandLineRunner {
    @Autowired
    AppConfig appConfig;
    @Override
    public void run(String... args) throws Exception {
        appConfig.electronics().showDetails();
    }
}
