package com.cr1stal423.pattern.Bridge;

import com.cr1stal423.pattern.Bridge.payment.OnlinePayment;
import com.cr1stal423.pattern.Bridge.payment.Payment;
import com.cr1stal423.pattern.Bridge.payment.StorePayment;
import com.cr1stal423.pattern.Bridge.processor.PaymentProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;


@Configuration
public class PaymentConfig {

    @Bean(name = "configuredOnlinePayment")
    @Scope("singleton")
    public Payment onlinePayment(List<PaymentProcessor> paymentProcessors) {
        return new OnlinePayment(paymentProcessors);
    }

    @Bean(name = "configuredStorePayment")
    @Scope("singleton")
    public Payment storePayment(List<PaymentProcessor> paymentProcessors) {
        return new StorePayment(paymentProcessors);
    }
}
