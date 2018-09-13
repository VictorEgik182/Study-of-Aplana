/**Homework №5, Aplana study, 09.09.2018
 @author Victor
  *@see
 *
 */

package HomeWork52;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор");

        Operation Operation = new Operation();
        System.out.println("\nВыберите нужное действие: ");
        System.out.println("\n1.Сложение");
        System.out.println("2.Вычитание");
        System.out.println("3.Умножение");
        System.out.println("4.Деление");
        System.out.println("\nВыбрана операция: ");

            int number3 = scanner.nextInt();
            switch (number3) {
                case 1:
                    Operation.sum();
                    break;
                case 2:
                    Operation.sub();
                    break;
                case 3:
                    Operation.mult();
                    break;
                case 4:
                    Operation.div();
                    break;
                default:
                    System.err.println("Ошибка!!!Введено неверное число!Повторите еще раз\n");
                    break;

            }
        }
    }
