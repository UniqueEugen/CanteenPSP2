package canteen.food;

import canteen.PriceInterface;

public abstract class Food implements PriceInterface {
    protected String fName;//Название еды
    protected boolean hot;//Горячее/холодное
    protected int quantity; //количество порций
    protected float fCost;//Себестоимость еды
    protected float fPrice;//Цена еды

    public Food()//конструктор класса
    {
        this.fName = new String();
        this.hot = true;
        fCost = 0;
        fPrice = 0;
    }

    public void setHot(boolean hot)//установка температуры еды
    {
        this.hot = hot;
    }

    protected void setPrice() {
        fPrice = countPrice();
    }

    public void setPrice(int price) {
        fPrice = price;
    }

    public void setCost(int cost) {
        fCost = cost;
        setPrice();
    }

    public float getPrice() {
        return fPrice;
    }

    public float getCost() {
        return fCost;
    }

    public float countPrice()//Подсчёт отпускной цены на основе себестоимости
    {
        float price;
        price = (float) (Math.round(((fCost * 1.2) * 1.2) * 100.0) / 100.0);
        return price;
    }

    public String toString() {
        String str = new String();
        str = "Блюдо " + fName + (hot ? ", горячее;" : ", холодное;") + " Cебестоимость: " + fCost + "BYN. Цена: " + fPrice + "BYN ";
        return str;
    }

    abstract protected void generateFoodName();//абстрактная функция
}
