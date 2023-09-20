package canteen.food.drink;

import canteen.food.dish.FirstDish;

public class TradableDrink extends Drink{
    private String type; //основа напитка
    private static int opdNum =0;
    private int opdPos; //позиция торгуемого напитка
    public TradableDrink()
    {
        super();
        type =new String();
        generateName();
        opdNum++;
        opdPos = opdNum;
    }
    public TradableDrink(String type, float volume, float cost, String fName, boolean hot, int quantity, String taste){
        this.type =type;
        this.taste = taste;
        this.volume=volume;
        this.fCost =cost;
        this.fPrice=this.countPrice();
        this.fName=fName;
        opdNum++;
        opdPos = opdNum;
        this.hot=hot;
        this.quantity = quantity;
    }
    protected void generateName()
    {
        fName=" напиток торгуемый ";
    }
    public String toString()
    {
        String str=new String();
        str=super.toString()+" тип напитка: "+ type;
        return str;
    }
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj instanceof FirstDish)
        {
            TradableDrink temp=(TradableDrink) obj;
            return this.opdPos ==temp.opdPos && this.fCost==temp.fCost &&
                    this.taste.equals(temp.taste) &&
                    this.hot == temp.hot &&
                    this.fName.equals(temp.fName) &&
                    this.fPrice==temp.fPrice &&
                    this.volume==temp.volume;

        }
        else
            return false;
    }
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 47 * hash + this.opdPos;
        return hash;
    }
}
