package canteen.food.dish;

import canteen.food.Food;

public class MainDish extends Food {
    protected String mainIngredient;
    protected int weight;
    public MainDish()
    {
        super();
        mainIngredient=new String();
        generateFoodName();
    }
    public void setMainIngredient(String mainIngredient)
    {
        this.mainIngredient=mainIngredient;
    }


    public void setMaxWeight(int weight)
    {
        this.weight=weight;
    }
    protected void generateFoodName() {
        fName="Unknown_Main_Dish";
    }


    public String toString()
    {
        String str=new String();
        str=super.toString()+" Главный ингредиент: "+mainIngredient;
        return str;
    }
}
