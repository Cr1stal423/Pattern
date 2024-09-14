package com.cr1stal423.pattern.Bridge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("bridge")
public class BridgeRunner implements CommandLineRunner {

    private final PaymentService paymentService;

    @Autowired
    public BridgeRunner(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) throws Exception {
        if (paymentService != null) {
            paymentService.processOnlinePayment(100.0);
        } else {
            System.out.println("PaymentService is not initialized.");
        }
        if (paymentService != null) {
            paymentService.processStorePayment(200.43);
        } else {
            System.out.println("PaymentService is not initialized.");
        }
    }
}