package collection.Map.hashMap;

import java.util.HashMap;

public class HashmapMethods implements Cloneable {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
        hm.put(1,"Vijay");
        hm.put(2,"Vicky");
        hm.put(3,"Vinu");
        hm.put(4,"Gokul");
        hm.put(5,"Gopi");

//        hm1.put(1,"Vijay");
//        hm1.put(2,"Vicky");


        System.out.println("Hashmap Values: "+hm); // like adding value with key and (value)
      //  System.out.println(hm.get(8)); //get the value with key wise or value is not their return null
//        hm.clear();           // clear all values and return the empty {}

      // System.out.println(hm.equals(hm1)); // check two condent equal or not

       // System.out.println(hm.hashCode()); //return the unique code
//        System.out.println(hm.containsKey(2)); // if key is their return true or falls
//        System.out.println(hm.containsValue("Vijay")); // if object is their return true or falls

//        Object hm2 = hm.clone(); //object copy
//        System.out.println(hm2);

      // System.out.println(hm.entrySet()); // return the all keys and values with [] type

       // System.out.println(hm.getOrDefault(0,""));// return object or empty

       // System.out.println(hm1.isEmpty()); // return true or falls

      //  System.out.println(hm.keySet()); // return all key values....

        //System.out.println(hm.remove(10));// remove the specific key with value

//        System.out.println(hm.replace(1,"VVVVV"));// change value and not key here return null
//        System.out.println(hm.replace(3,"V","VVV"));//change value old to new return true or false


        System.out.println(hm);














    }
}
