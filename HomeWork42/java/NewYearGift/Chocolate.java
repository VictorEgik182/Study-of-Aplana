package NewYearGift;

public class Chocolate extends Sweets {
    private double cacaoShare;

    public Chocolate(){}

    public Chocolate(double cacaoShare, double price, double weight) {
        super(weight, price);
        this.cacaoShare = cacaoShare;
    }

    public double getCacaoShare() {
        return cacaoShare;
    }

    public void setCacaoShare(double cacaoShare) {
        this.cacaoShare = cacaoShare;
    }

    @Override
    public String toString() {
        return "Chocolate + [" + super.toString() + ", cacaoShare = " + cacaoShare +"]";
    }
}