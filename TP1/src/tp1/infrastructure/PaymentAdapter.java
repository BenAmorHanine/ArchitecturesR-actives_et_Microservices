package tp1.infrastructure;
import tp1.domain.PaymentService;
public class PaymentAdapter implements PaymentService {
    private final OldPaymentSystem old;
    public PaymentAdapter(OldPaymentSystem old) { this.old = old; }
    public void pay(double amount) { old.makePayment(amount); }
}
