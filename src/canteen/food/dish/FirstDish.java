package canteen.food.dish;

public class FirstDish extends MainDish{

    private String base; //основа супа
    private static int fdNum=0;
    private int fdPos; //позиция первого блюда
    public FirstDish()
    {
        super();
        base=new String();
        generateName();
        fdNum++;
        fdPos=fdNum;
    }
    public FirstDish(String base, int weight, float cost, String fName, boolean hot, int quantity, String mainIngredient){
        this.base =base;
        this.mainIngredient = mainIngredient;
        this.weight=weight;
        this.fCost =cost;
        this.fPrice=this.countPrice();
        this.fName=fName;
        fdNum++;
        fdPos=fdNum;
        this.hot=hot;
        this.quantity = quantity;
    }
    protected void generateName()
    {
        fName=" первое блюдо ";
    }
    public String toString()
    {
        String str=new String();
        str=super.toString()+" Oснова супа: "+base;
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
            FirstDish temp=(FirstDish) obj;
            return this.fdPos==temp.fdPos && this.fCost==temp.fCost &&
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
        int hash = 7;
        hash = 47 * hash + (this.base != null ? this.base.hashCode() : 0);
        hash = 47 * hash + this.fdPos;
        return hash;
    }

}
