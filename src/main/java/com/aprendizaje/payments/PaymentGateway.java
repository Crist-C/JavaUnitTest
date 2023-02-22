package com.aprendizaje.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
