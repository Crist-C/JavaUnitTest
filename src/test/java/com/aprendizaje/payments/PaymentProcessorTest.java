package com.aprendizaje.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 *  Un test tiene tres partes,
 *  que se identifican con las siglas AAA en inglés:
 *      Arrange (Preparar)
 *      Act (Actuar)
 *      Assert (Afirmar).
 */
public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @Before
    public void setup(){

        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);

    }

    @Test
    public void payment_is_correct() {

        // Primera parte: Preparación del escenario
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        // Segunda parte: Ejecución del método
        // Tercera parte: Comprobación del resultado
        assertTrue(paymentProcessor.makePayment(1000));

    }

    @Test
    public void payment_is_not_correct() {

        Mockito.when(paymentGateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(paymentProcessor.makePayment(1000));

    }


}