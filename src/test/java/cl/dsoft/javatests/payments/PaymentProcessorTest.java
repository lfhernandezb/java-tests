package cl.dsoft.javatests.payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    @Test
    public void payment_is_correct() {
        // aca simulamos la clase PaymentGateway con Mockito (solamente existe como intersace)
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        // lo que quiero simular
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
            .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong() {
        // aca simulamos la clase PaymentGateway con Mockito (solamente existe como intersace)
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        // lo que quiero simular
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        assertFalse(paymentProcessor.makePayment(1000));
    }
}