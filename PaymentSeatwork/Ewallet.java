package PaymentSeatwork;

public class Ewallet implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("You are using GCash for payment");
    }
}

