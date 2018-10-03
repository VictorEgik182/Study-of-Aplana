package HomeWork7;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Numbers implements Calculator {
    double value1;
    double value2;

    Scanner scanner = new Scanner(System.in);


    @Override
    public double inputValue1() {
        System.out.println("Введите Первое число.Нажмите Enter: ");
        try {
            value1 = scanner.nextDouble( );
            return value1;
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ошибка ввода!Неверный формат данных");
        } catch (NullPointerException e) {
            throw new NullPointerException("Ошибка ввода!Неверный формат данных");
        }
    }



    @Override
    public double inputValue2() {
        System.out.println("Введите Второе число.Нажмите Enter: ");
        try {
            value2 = scanner.nextDouble( );
            if (value2 != 0) {
                return value2;
            } else {
                throw new ArithmeticException("На ноль делить нельзя");
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ошибка ввода!Неверный формат данных");
        } catch (NullPointerException e) {
            throw new NullPointerException("Ошибка ввода!Неверный формат данных");
        }
    }

        public double getValue1 ( ) {
            return value1;
        }

        public double getValue2 ( ) {
            return value2;
        }

        @Override public String toString ( ) {
            return value1 + " " + getOperation( ) + " " + value2 + " = " + calculateResult( );
        }
    }
