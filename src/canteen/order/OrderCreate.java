package canteen.order;

import canteen.Scan;


public interface OrderCreate{
    private boolean createNewOrder(){
        int newOrder;
        while (true) {
            System.out.println("Ожидаение...\nСоздать новый заказ. Введите символ единицы");
            newOrder = Scan.intScan();
            if (newOrder == 10 ||  newOrder == 1) {
                if(newOrder ==1){  return false;}
                else{ return true;}
            } else {
                System.out.println("!!!Warning!!!ОШИБКА ВВОДА!!!INPUT ERROR!!!ERROR DE ENTRADA!!!EINGABE FEHLER!!!WARNING!!!");
            }
        }
    }
    default boolean isNewOrder(){return createNewOrder();};
}
