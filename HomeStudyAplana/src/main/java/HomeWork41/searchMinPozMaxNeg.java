package HomeWork41;

/**
 * Aplana Study HomeWork#4-massiv
 * Created 19.08.2018
 * Modified 22.08.2018
 * @author Victor
 * @see searchMinPozMaxNeg
 *
 */

public class searchMinPozMaxNeg {
    public static void main(String[] args) {

        // Создаём массив размером 20
        int[] array = new int[20];

        //Присвоение значений элементам массива с выводом на экран консоли индекса и значения
        System.out.println("Массив чисел:\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20) - 11);
            System.out.println("Индекс: " + i + "   Значение: " + array[i]);
        }

        /**Поиск всех отрицательных элементов в массиве )Значение <0)*/
        int maxNegative = -1;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                maxNegative = array[i];
                break;
            }
        }

        System.out.println("\nЗначения элементов до замены:");
        //Поиск максимального по значению отрицательного элемента
        for (; i < array.length; i++) {
            if (array[i] < 0 && array[i] > maxNegative)
                maxNegative = array[i];
        }

        if (maxNegative == 0)
            System.out.println("Отрицательных элементов не найдено");
        else
            System.out.println("Максимальное отрицательное: " + maxNegative);


        /**Поиск всех положительных элементов в массиве )Значение >0)*/
        int minPositive = 1;
        for (i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                minPositive = array[i];
                break;
            }
        }

        //Поиск минимального по значению положительного элемента
        for (; i < array.length; i++) {
            if (array[i] > 0 && array[i] < minPositive)
                minPositive = array[i];
        }

        if (minPositive == 0)
            System.out.println("Положительных элементов не найдено");
        else
            System.out.println("Минимальное положительное: " + minPositive);

        int buff = maxNegative;
        maxNegative = minPositive;
        minPositive = buff;

        //Поменяем значения полученных ранее элементов
        System.out.println("\nЗначения элементов после замены:");
        System.out.println("Минимальное положительное: " + minPositive);
        System.out.println("Максимальное отрицательное: " + maxNegative);

    } //main
} //class searchMinPozMaxNeg
