package HomeWork52;

import java.util.Scanner;

public class Numbers implements Calculator {
        double value1;
        double value2;

    Scanner scanner = new Scanner(System.in);

    @Override
    public double number1() {
//вводим с клавиатуры первое число
        System.out.println("Введите любое число.Нажмите Enter: ");
        value1 = scanner.nextDouble();
        return value1;
    }

    @Override
    public double number2() {
//Вводим с клавиатуры второе число
        System.out.println("Введите любое число.Нажмите Enter: ");
        value2 = scanner.nextDouble();
        return value2;
    }
}
