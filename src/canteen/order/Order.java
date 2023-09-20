package canteen.order;

import canteen.PriceInterface;
import canteen.Scan;
import canteen.food.Food;


import java.time.LocalDate;
import java.util.ArrayList;

public class Order implements PriceInterface, OrderCreate {
    private ArrayList<Food> foods;
    private float cost;
    private float price;
    private static int orderNum=0;

    public void addFood(Food obj) {

        foods.add(obj);
    }

    public Order() {
        foods = new ArrayList<Food> ();
        orderNum=orderNum+1;
    }

    public static ArrayList<Integer> askAdd(){
        ArrayList<Integer> foodNums = new ArrayList();
        System.out.println("Что хотите довавить в заказ?");
        int foodNum;
        while (true) {
            foodNum = Scan.intScan();
            if (foodNum >= 0 ) {//так же глубокая вложенность тут
                if (foodNum == 0) {
                    if (foodNums.size() != 0) {
                        break;
                    } else {
                        System.out.println("!!!ЗАКАЗ ДОЛЖЕН ИМЕТЬ ХОТЯ БЫ 1 ПОЗИЦИЮ!!!\n Введите номер блюда.");
                    }
                } else {
                    foodNums.add(foodNum-1);
                    System.out.println("Можете добавить еще еды в заказ. Если закончили выбор введите 0");
                }
            }

        }
        return foodNums;
    }

    public boolean printOrder() {
        int i = 1;
        System.out.println(String.format("%65s", "").replace(" ", "*") + LocalDate.now() +
                String.format("%65s", "").replace(" ", "*"));
        System.out.println(String.format("%77s%03d%62s", "Чек по заказу №", orderNum, "")
                .replace(" ", "-"));
        for (Food food : foods) {
            System.out.println(i + ")" + (food).toString());
            i = i + 1;
        }
        System.out.println();
        System.out.println("Себестоимость заказа:" + cost + "\nИтого к оплате:" + price);
        System.out.println(String.format("%63s", "").replace(" ", "*") +
                "Закрытие чека" + String.format("%64s", "").replace(" ", "*"));
        return isNewOrder();
    }

    public float countPrice() {
        float tempPrice=0, tempCost=0;
        for(Food food: foods) {
            tempCost=tempCost+food.getCost();
            tempPrice=tempPrice+food.getPrice();
        }
        cost=(float) (Math.round(tempCost * 100.0) / 100.0);
        price=(float) (Math.round(tempPrice * 100.0) / 100.0);
        return tempPrice;
    }


}
