package HomeWork52;

public class Operation extends Numbers {

    public Operation() {
    }

    double sum;
    public double sum() {
        System.out.printf("Результат сложения чисел: %1$03.4f\n", (sum = (number1( ) + number2( ))));
        return sum;
    }

    double sub;
    public double sub() {
        System.out.printf("Результат вычитания чисел: %1$03.4f\n", (sub = (number1( ) - number2( ))));
        return sub;
    }

    double mult;
    public double mult() {
        System.out.printf("Результат умножения чисел: %1$03.4f\n", (mult = (number1( ) * number2( ))));
        return mult;
    }

    double div;
    public double div() {
            System.out.printf("Результат деления чисел: %1$03.4f\n", (div = (number1( ) / number2( ))));
            return div;
    }
}
