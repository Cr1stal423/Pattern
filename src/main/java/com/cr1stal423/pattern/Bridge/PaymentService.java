package com.cr1stal423.pattern.Bridge;

import com.cr1stal423.pattern.Bridge.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final Payment onlinePayment;
    private final Payment storePayment;

    @Autowired
    public PaymentService(@Qualifier("configuredOnlinePayment") Payment onlinePayment,
                          @Qualifier("configuredStorePayment") Payment storePayment) {
        this.onlinePayment = onlinePayment;
        this.storePayment = storePayment;
    }

    public void processOnlinePayment(double amount) {
        onlinePayment.pay(amount);
    }

    public void processStorePayment(double amount) {
        storePayment.pay(amount);
    }
}
