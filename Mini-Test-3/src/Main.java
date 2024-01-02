import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        Meat meat = new Meat("M1", "Beef", LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 10), 20.0, 1.5);
        double realPrice;
        realPrice = 0;
        int discount = 0;
        double finalPrice = realPrice * (1 - discount);

        System.out.println("Real price: " + realPrice);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Final price: " + finalPrice);
    }
}