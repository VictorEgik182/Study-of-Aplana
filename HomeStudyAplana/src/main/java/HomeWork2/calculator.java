package HomeWork2;

/**
 * Created for 2 lesson Aplana-Study 12.08/2018
 * @author Victor
 */

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Калькулятор");

        System.out.println("Введите любое число.Нажмите Enter: ");
        double a = scanner.nextDouble();

        System.out.println("Введите любое число.Нажмите Enter: ");
        double b = scanner.nextDouble();

        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);

        System.out.print("\nВыберите нужное действие: ");
        System.out.println("\n1.Сложение");
        System.out.println("2.Вычитание");
        System.out.println("3.Умножение");
        System.out.println("4.Деление");
        System.out.print("\nВыбрана операция: ");

        int selected = scanner.nextInt();

        switch (selected) {
            case 1:
                double sum = a + b;
                System.out.printf("Результат сложения чисел: %1$03.4f\n", sum);
                break;
            case 2:
                double sub = a - b;
                System.out.printf("Результат вычитания чисел: %1$03.4f\n", sub);
                break;
            case 3:
                double mult = a * b;
                System.out.printf("Результат произведения чисел: %1$03.4f\n", mult);
                break;
            case 4:
                double div = a / b;
                System.out.printf("Результат деления чисел: %1$03.4f", div);
                break;
            default:
                System.err.println("Ошибка!!!Введено неверное число!Повторите еще раз\n");
                break;
        }

        scanner.close();

    }
}
