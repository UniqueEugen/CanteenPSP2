package canteen.food.dish;

public class SecondDish extends MainDish{
    private String garnish; //основа супа
    private static int sdNum=0;
    private int sdPos; //позиция 2 блюда
    public SecondDish()
    {
        super();
        garnish=new String();
        generateName();
        sdNum++;
        sdPos=sdNum;
    }
    public SecondDish(String garnish, int weight, float cost, String fName, boolean hot, int quantity, String mainIngredient){
        this.garnish =garnish;
        this.mainIngredient = mainIngredient;
        this.weight=weight;
        this.fCost =cost;
        this.fPrice=this.countPrice();
        this.fName=fName;
        sdNum++;
        sdPos=sdNum;
        this.hot=hot;
        this.quantity = quantity;
    }
    protected void generateName()
    {
        fName="второе блюдо";
    }
    public String toString()
    {
        String str=new String();
        str=super.toString()+" гарнир: "+garnish;
        return str;
    }
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj instanceof FirstDish )
        {
            SecondDish temp=(SecondDish) obj;
            return this.sdPos==temp.sdPos && this.fCost==temp.fCost &&
                    this.mainIngredient.equals(temp.mainIngredient) &&
                    this.hot == temp.hot &&
                    this.fName.equals(temp.fName) &&
                    this.fPrice==temp.fPrice &&
                    this.weight==temp.weight;

        }
        else
            return false;
    }
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.garnish != null ? this.garnish.hashCode() : 0);
        hash = 79 * hash + this.sdPos;
        return hash;
    }
}
