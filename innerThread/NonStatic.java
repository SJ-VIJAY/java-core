package innerThread;

import java.util.Map;

// non-static or member class
class Mobile {
    private int mobPrice = 15000;

    void mobBuy(int price) {
        if (price >= mobPrice) {
            System.out.println("Mobile purchased successfully done..");
        } else {
            System.out.println("Not enough money for mobile purchase..");
        }
        System.out.println("Purchased price: "+price);
        System.out.println(">>>>>>>>>>>>");
    }
    class Laptop {
        int lapPrice = 40000;

        void lapBuy(int price) {
            if (price >= lapPrice) {
                System.out.println("Laptop purchased successfully done..");
            } else {
                System.out.println("Not enough money for Laptop purchase..");
            }
            System.out.println("Purchased price: "+price);
            System.out.println(">>>>>>>>>>>>");
        }
    }
    // method local inner class
     void lapMobBuy(){

        class LapMob{
            void buy(int price) {
                if (price >= 50000) {
                    System.out.println("Mobile and laptop was purchased....");
                } else {
                    System.out.println("Not enough money for Laptop & Mobile purchase..");
                }
                System.out.println("Lap and Mob Purchased price is: "+price);
            }
        }
        LapMob lm = new LapMob();
        lm.buy(51000);
    }
    // static inner class
    static class Tab{
         int tabPrice = 10000;
        void tabBuy(int price){
            System.out.println(">>>>>>>>>>>");
            if(price >= tabPrice){
                System.out.println("Tab purchase was done...");
            }
            else {
                System.out.println("Not enough money for tab purchase..");
            }
        }
    }
}
public class NonStatic {
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.mobBuy(18000);

        Mobile.Laptop ml = mb.new Laptop();
        ml.lapBuy(40500);

        mb.lapMobBuy();

        Mobile.Tab mt = new Mobile.Tab();     // static was not under -stand
        mt.tabBuy(12000);

// Anonymous class
        Thread th = new Thread(){
            public void  run(){
                System.out.println(">>>>>>>>>>>>");
                System.out.println("Anonymous class was called....");
            }
        };
        th.start();
    }
}
