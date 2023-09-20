package canteen.food.drink;

import canteen.food.dish.FirstDish;

public class OwnProdDrink extends Drink{
    private String base; //основа напитка
    private static int opdNum =0;
    private int opdPos; //позиция первого блюда
    public OwnProdDrink()
    {
        super();
        base=new String();
        generateName();
        opdNum++;
        opdPos = opdNum;
    }
    public OwnProdDrink(String base, float volume, float cost, String fName, boolean hot, int quantity, String taste){
        this.base =base;
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
        fName=" напиток собственного производства";
    }
    public String toString()
    {
        String str=new String();
        str=super.toString()+" основа напитка: "+base;
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
            OwnProdDrink temp=(OwnProdDrink) obj;
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
        hash = 47 * hash + (this.base != null ? this.base.hashCode() : 0);
        hash = 47 * hash + this.opdPos;
        return hash;
    }
}
