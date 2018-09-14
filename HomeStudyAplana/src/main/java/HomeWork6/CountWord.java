package HomeWork6;

import java.io.File;
import java.util.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountWord {

    Scanner scanner;
    ArrayList list = new ArrayList( );

    public void openReadFile(){
        try {
            scanner = new Scanner(new File("C:/Users/Виктор/IdeaProjects/HomeStudyAplana/src/main/java/HomeWork6/Words.txt"));
            while (scanner.hasNext( )) {
                String word = scanner.next( );
                list.add(word);
            }
        }catch (Exception zxc) {
            System.out.println("Файл не найден!Проверьте, правильно ли указан путь к файлу!");
            zxc.printStackTrace();
        }
        System.out.println("В файле есть слова: " + list);
    }

    public void sortingAndMaxCountWords() {
        Set<String> sortedSet = new TreeSet<>( );
        Map<String, Integer> statistic = new HashMap<>( );
        int countWord = 0;
        String word;
        String maxCountWord[];
        maxCountWord = new String[1];


        for (int i = 0; i < list.size( ); i++) {
            word = (String) list.get(i);
            sortedSet.add(word);

            Integer count = statistic.get(word);
            if (count == null) {
                count = 0;
            }
            statistic.put(word, ++count);

            if (count > countWord) {
                countWord = count;
                maxCountWord[0] = word;
            }
        }
        System.out.println("Слова из файла в алфавитном порядке: " + sortedSet);
        System.out.println("Содержание слов в файла: " + statistic);
        System.out.println("Наибольшее по количеству символов: " + maxCountWord[0] + " Колличество повторений = " + countWord);
    }
}
