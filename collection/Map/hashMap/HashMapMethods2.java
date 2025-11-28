package collection.Map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"vijay");
        hm.put(9,null);
        hm.put(8,"Java");
        hm.put(7,"Spring");
        hm.put(5,"Vicky");

        System.out.println(hm);
        System.out.println(hm.getOrDefault(1,"vv"));

//        System.out.println(hm.entrySet());
//        System.out.println(hm.containsKey(11));
    //    System.out.println(hm.containsValue("Java"));
       // System.out.println(hm.keySet());
       // System.out.println(hm.remove(8));
       // System.out.println(hm.remove(1,"vv"));

       // System.out.println(hm.values());
//        System.out.println(hm.replace(1,"Vv")); // return old value
//        System.out.println(hm.replace(5,"Vicky","ppp"));

        // For Each Traverse using Entry interface

        for (Map.Entry<Integer, String> hm1 : hm.entrySet()) {
            System.out.println(hm1.getKey() + " : " + hm1.getValue());


        }

    }
}
