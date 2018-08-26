package HomeWork42.NewYearGift;

public class candies extends sweets {
    private double juiceContent;

    public candies(){}

    public candies(double juiceContent, double weight, double price) {
        super(weight, price);
        this.juiceContent = juiceContent;
    }

    public double getJuiceContent() {
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