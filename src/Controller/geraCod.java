package Controller;

import java.util.Random;

public class geraCod {

    public  static  int  geraCod() {
    int x =0;
    Random al = new Random();
       do {
         x = al.nextInt(10000);
       } while(x < 1000 || x > 10000);
       
         return x;
    }
}