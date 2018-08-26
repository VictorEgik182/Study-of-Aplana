package HomeWork42;

/**Homework №4, part 2, Aplana study, 19.08.2018
 @author Victor
  * @see BaseHomeWork4
 */

import HomeWork42.NewYearGift.biscuit;
        import HomeWork42.NewYearGift.candies;
        import HomeWork42.NewYearGift.chocolate;
        import HomeWork42.NewYearGift.sweets;

public class base {

    public static void main(String[] args){

        //Печенье
        biscuit biscuit2=new biscuit(45,150,210);
        biscuit biscuit=new biscuit();
        biscuit.setCaloricity(50);   // Процент содержания (50%)
        biscuit.setPrice(160);        // Цена за КГ в Рублях
        biscuit.setWeight(220);     //Вес в г

        //Леденцы
        candies candies2=new candies(25,150,300);
        candies candies=new candies();
        candies.setJuiceContent(30);  // Процент содержания (30%)
        candies.setPrice(200);         // Цена за КГ в Рублях
        candies.setWeight(350);        //Вес в г

        //Шоколад
        chocolate chocolate2=new chocolate(80,300,400);
        chocolate chocolate=new chocolate();
        chocolate.setCacaoShare(85);    // Процент содержания (85%)
        chocolate.setPrice(350);        // Цена за КГ в Рублях
        chocolate.setWeight(500);       //Вес в г

        sweets[] box ={biscuit, biscuit2, candies, candies2, chocolate, chocolate2};
        for (sweets someSweets : box) {
            System.out.println(someSweets.toString());
        }

        //Общий вес Новогоднего подарка
        System.out.print("Общий вес Новогоднего подарка (Грамм): ");

        System.out.println(biscuit.getWeight()+ biscuit2.getWeight()
                +candies.getWeight()+candies2.getWeight()
                +chocolate.getWeight()+chocolate2.getWeight());

        //Общая стоимость Новогоднего подарка
        System.out.print("Общая стоимость Новогоднего подарка (Руб): ");

        System.out.println(biscuit.getPrice()+ biscuit2.getPrice()
                +candies.getPrice()+candies2.getPrice()
                +chocolate.getPrice()+chocolate2.getPrice());

    }//public static void main
}//public class base




