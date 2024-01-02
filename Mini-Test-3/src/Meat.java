import java.time.LocalDate;

public class Meat extends Material{
    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public Meat(String m1, String beef, LocalDate of, LocalDate of1, double weight, double v) {
        super(m1, beef, of, of1, weight, v);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }
}

interface Discount {
    double getRealMoney();
}

