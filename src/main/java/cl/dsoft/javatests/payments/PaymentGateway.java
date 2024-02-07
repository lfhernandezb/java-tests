package cl.dsoft.javatests.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
