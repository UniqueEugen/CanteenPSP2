package canteen.food.drink;

import canteen.food.Food;

public class Drink extends Food {
    protected String taste;
    protected float volume;
    public Drink()
    {
        super();
        taste =new String();
        generateFoodName();
    }
    public void setTaste(String taste)
    {
        this.taste = taste;
    }


    public void setMaxWeight(int weight)
    {
        this.volume =weight;
    }
    protected void generateFoodName() {
        fName="Unknown_Drink";
    }


    public String toString()
    {
        String str=new String();
        str=super.toString()+" Вкус:"+ taste;
        return str;
    }
}
