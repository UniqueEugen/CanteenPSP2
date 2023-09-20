package canteen;

import java.util.Scanner;

public class Scan {
   static public int intScan(){
        Scanner sc = new Scanner(System.in);
        int i;
        while (true) {
            try {
                i = Integer.parseInt(sc.next());
                return i;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }
        }
    }
}
