package collection.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo implements Cloneable {
    public static void main(String[] args) {
        // 5 constructors in HashSet

        HashSet hs = new HashSet();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);   // insertion order maintain.
        hs.add(null);  //only one null value can be stored

        HashSet hs1 = new HashSet();

       hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);
        hs1.add(50);
        hs1.add(60);   // insertion order maintain.



        System.out.println(hs);
        System.out.println(hs1);
//        // read
//        // with iterator method
//        Iterator it = hs.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next()+" ");
//       }
////remove
//        System.out.println(hs);
//        hs.remove(50);
//        System.out.println(hs);
//
//        System.out.println(hs);
//        hs.removeAll(hs);    // remove all elements
//        System.out.println(hs);
//
//        System.out.println(hs); // contains return true or falls
//        System.out.println(hs.contains(1));
//        System.out.println(hs.containsAll(hs1));
//
//      HashSet clone = (HashSet) hs.clone();
//        System.out.println(hs);
//        System.out.println(clone); // clone success
//
//        System.out.println(hs.size());// size fetched
//        System.out.println(hs);
//         hs.clear();   // clear method will work
//        System.out.println(hs);


    }
}
