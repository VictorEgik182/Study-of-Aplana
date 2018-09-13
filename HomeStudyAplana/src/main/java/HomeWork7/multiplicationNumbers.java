package HomeWork7;

public class multiplicationNumbers extends Numbers {

    @Override
    public String getOperation() {
        return "*";
    }

    @Override
    public double calculateResult() {
        return getValue1() * getValue2();
    }
}
