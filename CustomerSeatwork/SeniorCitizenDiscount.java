package CustomerSeatwork;

public class SeniorCitizenDiscount implements DiscountType {
    
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}