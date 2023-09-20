package canteen;

import canteen.food.Food;
import canteen.food.dish.FirstDish;
import canteen.food.dish.SecondDish;
import canteen.food.drink.OwnProdDrink;
import canteen.food.drink.TradableDrink;
import canteen.order.Order;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList();
        foods.add(new FirstDish("Молоко", 300, 1.25F, "Молочный суп", false, 25, "Макароны"));
        foods.add(new FirstDish("Вода", 250, 1.89F, "Борщ", true, 35, "Картошка/Свекла"));
        foods.add(new SecondDish("Пюрешка", 450, 3.25F, "Вареный говяжий язык с пюрешкой", true, 10, "Говяжий язык"));
        foods.add(new SecondDish("Макароны", 350, 2.2F, "Котлета <<С Припечка>> с макаронами", true, 20, "Котлета <<С Припечка>>"));
        foods.add(new OwnProdDrink("Вода", 400, 0.65F, "Компот брусничный", false, 30, "Брусника с яблоком"));
        foods.add(new OwnProdDrink("Кефир", 400, 0.95F, "Йогурт питьевой ягодный", false, 10, "Малина/Вишня/Смородина"));
        foods.add(new OwnProdDrink("Вода", 250, 0.89F, "Чай", true, 100, "Бергамот"));
        foods.add(new TradableDrink("Энергетический напиток", 500, 2.39F, "DYNAMI:T", false, 20, "Кисленький"));
        foods.add(new TradableDrink("Минеральная вода", 330, 1.29F, "Бонаква", false, 30, "Нет"));

        while (true){ // Вам не понравилась эта конструкция
            Order order = new Order();
            {
                int i = 1;
                for (Food food : foods) {
                    System.out.println("#" + i + " " + food.toString());
                    i++;
                }
            }
            for (int foodNum : Order.askAdd()) {
                order.addFood(foods.get(foodNum));
            }
            order.countPrice();
            if (order.printOrder()) {
                break;
            } else {
                clearConsole();
            }

        }
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            //  Handle any exceptions.
            System.out.println(e);
        }
    }
}