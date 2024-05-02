package CustomerSeatwork;

public class Main{
    public static void main(String[] args) {
        Customer student = new Customer("Student customer: Sofia's", new StudentDiscount());
        Customer senior = new Customer("Senior customer: Elizabeth's", new SeniorCitizenDiscount());
        Customer regular = new Customer("Regular customer: Mikaela's", new RegularDiscount());

        double amount = 10000.0;

        System.out.println(student.getName() + " Discounted Price is PHP" + student.applyDiscount(amount));
        System.out.println(senior.getName() + " Discounted Price is PHP" + senior.applyDiscount(amount));
        System.out.println(regular.getName() + "Regular Price is PHP" + regular.applyDiscount(amount));
    }
}
