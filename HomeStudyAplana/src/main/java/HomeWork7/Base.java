/**
 * Homework №5, Aplana study, 09.09.2018
 *
 * @author Victor
 * Modified 13.09.2018
 * Modified 03.10.2018
 */

package HomeWork7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор");

        System.out.println("\nВыберите нужное действие: ");
        System.out.println("\n1.Сложение");
        System.out.println("2.Вычитание");
        System.out.println("3.Умножение");
        System.out.println("4.Деление");
        System.out.println("\nВведите число в соответствии с выбранной операцией.Нажмите Enter: ");

        Calculator Calculator = null;
        {
            int operator;
            try {
                operator = scanner.nextInt( );
                switch ( operator ) {
                    case 1:
                        Calculator = new additionNumbers( );
                        break;
                    case 2:
                        Calculator = new subtractionNumbers( );
                        break;
                    case 3:
                        Calculator = new multiplicationNumbers( );
                        break;
                    case 4:
                        Calculator = new divisionNumbers( );
                        break;
                    default:
                        throw new ArithmeticException("Ошибка!Нет такой операции!Повторите еще раз!");
                }
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Ошибка ввода!Неверный формат данных");
            } catch (NullPointerException e) {
                throw new NullPointerException("Ошибка ввода!Неверный формат данных");
            }
        }
        Calculator.inputValue1 ();
        Calculator.inputValue2 ();
        Calculator.getOperation ();
        Calculator.calculateResult ();
        System.out.printf("Результат: \n");
        System.out.println(Calculator.toString());
    }
}
