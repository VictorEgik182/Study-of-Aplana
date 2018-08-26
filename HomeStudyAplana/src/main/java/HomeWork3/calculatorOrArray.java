package HomeWork3;

/**
 * Created for 2 lesson Aplana-Study 12.08.2018
 * Modified 15.08.2018/19.08.2018
 * @author Victor
 * @see choiceCalculatorOrSearchMawWord
 */

//Импортируем пакет java.util, который позволит нам работать со сканером
import java.util.Scanner;

//Создаем публичный класс calculatorOrArray
public class calculatorOrArray {
    public static void main(String[] args) {

        // Создаем экземпляр класса Scanner
        Scanner scanner = new Scanner(System.in);

        // Надпись для ввода значений чисел 1, 2 или любого другого
        System.out.println("Введите число 1 для выбора калькулятора, 2 - выбора массива.Далее нажмите Enter");

        //Ввод значения в консоль
        double d = scanner.nextDouble();

        //Условие 1. Если ввели число 1
        if (d == 1) {
            System.out.println("Выбран Калькулятор"); //В консоли появился надпись выбора, при вводе числа 1
            System.out.println("Введите любое число.Нажмите Enter: "); //Появилась надпись, Подсказка действий

            //Ввод в консоль первого числа (Double - число с плавающей точкой).
            double a = scanner.nextDouble();
            System.out.println("Введите любое число.Нажмите Enter: "); //Появилась надпись, Подсказка действий

            //Ввод в консоль второго числа (Double - число с плавающей точкой).
            double b = scanner.nextDouble();
            System.out.println("Первое число: " + a); // Вывод на консоль первого числа.
            System.out.println("Второе число: " + b); // Вывод на консоль первого числа.

            System.out.print("\nВыберите нужное действие: "); //Выводится надпись, для выбора действий
            System.out.println("\n1.Сложение");
            System.out.println("2.Вычитание");
            System.out.println("3.Умножение");
            System.out.println("4.Деление");
            System.out.print("\nВыбрана операция: ");

            // Считываем число для выбора действий
            int selected = scanner.nextInt();

            //Проверка переменной selected
            switch (selected) {

                //Если ввели число 1 (выбрали "Сложение")
                case 1:
                    double sum = a + b;
                    System.out.printf("Результат сложения чисел: %1$03.4f\n", sum);
                    break;

                //Если ввели число 2 (выбрали "Вычитание")
                case 2:
                    double sub = a - b;
                    System.out.printf("Результат вычитания чисел: %1$03.4f\n", sub);
                    break;

                //Если ввели число 3 (выбрали "Умножение")
                case 3:
                    double mult = a * b;
                    System.out.printf("Результат произведения чисел: %1$03.4f\n", mult);
                    break;

                //Если ввели число 4 (выбрали "Деление")
                case 4:
                    double div = a / b;
                    System.out.printf("Результат деления чисел: %1$03.4f", div);
                    break;

                //По умолчанию (Если было введено число, отличное от предложенных для выбора ввода)
                default:
                    System.err.println("Ошибка!!!Введено неверное число!Повторите еще раз\n");
                    break;
            }

            scanner.close();

        } //Условие 1

        //Условие 2. Если ввели число 2
        else if (d == 2) {

            System.out.println("Выбран Массив"); //В консоли появился надпись выбора, при вводе числа 2

            // Объявляем Scanner
            Scanner input = new Scanner(System.in);
            System.out.println("Введите длинну массива (число от 1 до 6): "); //Выводится надпись, Подсказка

            //Вводим в консоль размер массива
            int g = input.nextInt();

            if (g >= 1 && g <= 6) //Условие для размерности массива True
            {
                String array[] = new String[g]; // Создаём массив размером в size
                System.out.println("Введите элементы массива:"); //Надпись, подсказка

                //Присвоение значений элементам массива//
                for (int i = 0; i < g; i++) {

                    // Заполняем массив элементами, введёнными с консоли
                    String word1 = input.next();
                    array[i] = word1;
                }

                System.out.print("Элементы массива:");

                for (int i = 0; i < g; i++) {

                    // Выводим на экран консоли, сформирвоанный массив слов
                    System.out.println(" " + array[i]);
                }

                //Находим слово в массиве с максимальной длинной
                System.out.print("\nСамое длинное слово в массиве:\n");

                String MaxWord = array[0];
                int max = MaxWord.length();

                //Прогоняем по массиву, находим саммые длинные слова.
                for (int i = 1; i < g; i++) {
                    if (max < array[i].length()) {
                        max = array[i].length();
                    }
                }

                //Второй прогон по массиву. Из найденных раннее максимальных слов, выводим наибольшее по размеру
                for(int j = 0; j < g; j++) {
                    if (max == array[j].length()) {
                        System.out.println(" " + array[j]);
                    }
                }

            } //Условие для размерности массива True

            //Условие для размерности массива False
            else if (g==0 || g > 6) {

                // Выводим на экран консоли ошибку при некорртекном вводе значения размера массива
                System.out.print("Ошибка ввода.Ведите число от 1 до 6");
            }

        } //Условие 2

        //Условие 3. Если ввели число, отличное от 1 или 2
        else if(d > 2 || d < 1 )
        {
            //В консоли появился надпись с ошибкой, при вводе значений, отличных от 1 или 2
            System.out.println("Ошибка ввода.Ведено некоректное значение.Попробуйте еще раз");

        } //Условие 3

    } //public static void main

} //public class calculatorOrArray

