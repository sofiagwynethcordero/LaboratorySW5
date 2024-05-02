package CustomerSeatwork;

public class Customer {
    private String name;
    private DiscountType discountType;

    public Customer(String name, DiscountType discountType) {
        this.name = name;
        this.discountType = discountType;
    }

    public String getName() {
        return this.name;
    }

    public double applyDiscount(double amount) {
        double discount = discountType.calculateDiscount(amount);
        return amount - discount;
    }
}
