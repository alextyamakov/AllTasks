package Task4;

import Task4.Candies.All_kinds;
import Task4.Candies.Bubble_gum;
import Task4.Candies.Candy_bars;
import Task4.Candies.Caramels;

public class Gifts {
    public static void main(String[] args) {
        Candy_bars candy_bar1 = new Candy_bars("Mars", 0.3,10.5, "Small");
        Candy_bars candy_bar2 = new Candy_bars("Snickers", 0.50, 6, "Medium");
        Candy_bars candy_bar3 = new Candy_bars("Toblerone", 0.9, 15, "Too big");
        Bubble_gum bubble_gum1 = new Bubble_gum("Combo", 0.1, 2.2, "Blue");
        Bubble_gum bubble_gum2 = new Bubble_gum("Colorado", 0.4,3.8,"Orange");
        Bubble_gum bubble_gum3 = new Bubble_gum("Snowball", 0.33, 3, "White");
        Caramels caramel1 = new Caramels("M@M's",0.6,12,78);
        Caramels caramel2 = new Caramels("Apple Pop", 0.8,10,85);

        All_kinds[] bag = {candy_bar1, candy_bar2, candy_bar3, bubble_gum1, bubble_gum2, bubble_gum3,caramel1, caramel2};
        double Summ_weight = 0;
        double Summ_price = 0;

        for (All_kinds item : bag) {
            Summ_weight += item.weight;
            Summ_price += item.price;
        }
        System.out.printf("Total weight: %.2f kg\n", Summ_weight);
        System.out.printf("Total price: %.2f $\n", Summ_price);
        System.out.println("Content of the bag: ");
        for (All_kinds item: bag) {
            System.out.println(item.toString());
        }
    }
}

