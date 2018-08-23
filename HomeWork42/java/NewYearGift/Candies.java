package NewYearGift;

public class Candies extends Sweets {
    private double juiceContent;

    public Candies(){}

    public Candies(double juiceContent, double weight, double price) {
        super(weight, price);
        this.juiceContent = juiceContent;
    }

    public double getjuiceContent() {
        return juiceContent;
    }

    public void setJuiceContent(double juiceContent) {
        this.juiceContent = juiceContent;
    }

    @Override
    public String toString() {
        return "Candies + [" + super.toString() + ", juiceContent = " + juiceContent+"]";
    }
}