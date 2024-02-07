package cl.dsoft.javatests.payments;

public class PaymentProcessor {
    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    PaymentGateway getPaymentGateway() {
        return this.paymentGateway;
    }

    public boolean makePayment(double amount) {
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));

        return response.getStatus() == PaymentResponse.PaymentStatus.OK;
    }
}