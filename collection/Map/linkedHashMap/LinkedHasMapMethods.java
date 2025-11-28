package collection.Map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapMethods {
    public static void main(String[] args) {
        LinkedHashMap<String,String> lm =new LinkedHashMap<>();
        lm.put("Sachin","Addidas");
        lm.put("Dhoni","Reebook");
        lm.put("Virat","Puma");
        lm.put("Gokul","Tail");
        lm.put("Vinu","Head");

        System.out.println(lm.putFirst("Vijay","Choco"));
        System.out.println(lm.putLast("Vicky","Redserve"));
//        System.out.println(lm.pollFirstEntry());
//
//        System.out.println(lm.pollLastEntry());
//        System.out.println(lm.firstEntry());
//        System.out.println(lm.lastEntry());
        System.out.println(lm);

        System.out.println(lm.reversed());

        for (Map.Entry<String,String> lm1 :lm.entrySet()){
            System.out.println(lm1.getKey() + " : " + lm1.getValue() );

        }
       // System.out.println(lm.firstEntry().getKey() + " = " + lm.firstEntry().getValue());


    }
}
