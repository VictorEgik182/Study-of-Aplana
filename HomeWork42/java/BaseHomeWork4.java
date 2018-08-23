/**Homework №4, part 2, Aplana study, 19.08.2018
 @author Victor
 * @see BaseHomeWork4
 */

import NewYearGift.Biscuit;
import NewYearGift.Candies;
import NewYearGift.Chocolate;
import NewYearGift.Sweets;

public class BaseHomeWork4 {

    public static void main(String[] args){

        //Печенье
        Biscuit Biscuit2=new Biscuit(45,150,210);
        Biscuit Biscuit=new Biscuit();
        Biscuit.setCaloricity(50);   // Процент содержания (50%)
        Biscuit.setPrice(160);        // Цена за КГ в Рублях
        Biscuit.setWeight(220);     //Вес в г

        //Леденцы
        Candies Candies2=new Candies(25,150,300);
        Candies Candies=new Candies();
        Candies.setJuiceContent(30);  // Процент содержания (30%)
        Candies.setPrice(200);         // Цена за КГ в Рублях
        Candies.setWeight(350);        //Вес в г

        //Шоколад
        Chocolate Chocolate2=new Chocolate(80,300,400);
        Chocolate Chocolate=new Chocolate();
        Chocolate.setCacaoShare(85);    // Процент содержания (85%)
        Chocolate.setPrice(350);        // Цена за КГ в Рублях
        Chocolate.setWeight(500);       //Вес в г

        Sweets[] box ={Biscuit, Biscuit2, Candies, Candies2, Chocolate, Chocolate2};
        for (Sweets someSweets : box) {
            System.out.println(someSweets.toString());
        }

        //Общий вес Новогоднего подарка
        System.out.print("Общий вес Новогоднего подарка: ");

        System.out.println(Biscuit.getWeight()+ Biscuit2.getWeight()
                +Candies.getWeight()+Candies2.getWeight()
                +Chocolate.getWeight()+Chocolate2.getWeight());

        //Общая стоимость Новогоднего подарка
        System.out.print("Общая стоимость Новогоднего подарка: ");

        System.out.println(Biscuit.getPrice()+ Biscuit2.getPrice()
                +Candies.getPrice()+Candies2.getPrice()
                +Chocolate.getPrice()+Chocolate2.getPrice());

    }//public static void main
}//public class BaseHomeWork4




