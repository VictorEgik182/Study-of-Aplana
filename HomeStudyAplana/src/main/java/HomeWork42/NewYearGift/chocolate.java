package HomeWork42.NewYearGift;


public class chocolate extends sweets {
    private double cacaoShare;

    public chocolate(){}

    public chocolate(double cacaoShare, double price, double weight) {
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