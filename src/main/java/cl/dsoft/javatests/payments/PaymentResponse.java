package cl.dsoft.javatests.payments;

public class PaymentResponse {

    public enum PaymentStatus {
        OK, ERROR
    }

    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    PaymentStatus getStatus() {
        return this.status;
    }
}
