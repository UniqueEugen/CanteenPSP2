package food;

public abstract class Food implements Pr {
    protected String fName;//Название еды
    protected boolean hot;//Горячее/холодное
    protected int fCost;//Себестоимость еды
    protected int fPrice;//Цена еды
    public Food()//конструктор класса
    { fName=new String();
        hot = true;
        fCost=0;
        fPrice=0;}
    abstract protected void generateFoodName();//абстрактная функция
    public void setHot(boolean hot)//установка температуры еды
    {
        this.hot=hot;
    }
    protected void setPrice()
    {
        fPrice=countPrice();
    }
    public void setPrice(int price)
    {
        fPrice=price;
    }

    public void setCost(int cost)
    {
        fCost=cost;
        setPrice();
    }
    public int getPrice()
    {
        return fPrice;
    }
    public int getCost()
    {
        return fCost;
    }

    public int countPrice()//Подсчёт отпускной цены на основе себестоимости
    {
        int price;
        price=(int) ((fCost*1.2)*1.2);
        return price;
    }

    public String toString()
    {
        String str=new String();
        str="Блюдо "+fName + (hot? "горячее":"холодное")+" себестоимость:"+fCost+"BYN. Цена:"+fPrice+"BYN";
        return str;
    }
}
