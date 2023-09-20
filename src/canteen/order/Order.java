package order;

import food.Food;

import java.util.ArrayList;
public class Order implements PriceInerface {
    private ArrayList<Food> furnitureColl;
    private int cost;
    private int price;
    private static int orderNum=0;
}
