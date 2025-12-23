package problemsolving.numberproblems;

import java.util.ArrayList;

public class Factors {
    static void fact(int n){
        System.out.println("factors of: "+n);
        for(int i = 1; i <= n; i++){
            if(n%i == 0)
                System.out.println(i);
        }
    }
    static void fact2(int n){
        System.out.println("factors of "+n+" is:");
        ArrayList<Integer> fact = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n%i == 0)
                fact.add(i);
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
         // fact(10);
         fact2(100);
    }
}
