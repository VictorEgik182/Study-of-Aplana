package HomeWork42.NewYearGift;

public abstract class sweets {
    private double weight;
    private double price;

    public sweets (){}

    public sweets (double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "weight = " +weight+", price = "+price;
    }
}
