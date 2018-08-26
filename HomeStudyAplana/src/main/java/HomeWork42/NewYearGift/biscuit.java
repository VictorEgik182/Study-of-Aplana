package HomeWork42.NewYearGift;

public class biscuit extends sweets {
    private double Caloricity;

    public biscuit(){}

    public biscuit(double Caloricity, double price, double weight) {
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