package collection.list;

import java.util.ArrayList;

public class ArraListCapacity {
    public static void main(String[] args) {
        ArrayList ai = new ArrayList();
        ai.add(10);
        ai.add(20);
        ai.add(30);
        ai.add(40);
        ai.add(50);
        ai.add(60);
        ai.add(70);
        ai.add(80);
        ai.add(90);
        ai.add(100);

        int iniCap = 10;
        int cap  = 0;

        System.out.println("Current size of ai = "+ai.size());
        for (int i = 0;i<ai.size();i++){
           iniCap = iniCap + (iniCap / 2);

            System.out.println("After capacity increase: "+iniCap );
        }



    }
}
