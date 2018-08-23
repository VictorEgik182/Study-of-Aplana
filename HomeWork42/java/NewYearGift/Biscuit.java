package NewYearGift;

public class Biscuit extends Sweets {
    private double Caloricity;

    public Biscuit(){}

    public Biscuit(double Caloricity, double price, double weight) {
        super(weight, price);
        this.Caloricity = Caloricity;
    }

    public double getCaloricity() {
        return Caloricity;
    }

    public void setCaloricity(double Caloricity) {
        this.Caloricity = Caloricity;
    }

    @Override
    public String toString() {
        return "Biscuit + [" + super.toString() + ", Caloricity = " + Caloricity +"]";
    }
}