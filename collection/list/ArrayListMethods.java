package collection.list;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(null);
        ar.add(true);
        ar.add(1.2);
        ar.add(223.34);
        ar.add('A');
        ar.add("Vijay");
       //System.out.println("Add method: "+ar);

        ArrayList ar1 = new ArrayList();
        ar1.add(10);
        ar1.add(20);
        ar1.add(null);
        ar1.add(true);
        ar1.add(1.2);



/*       System.out.println(ar1);
       ar1.addAll(1,ar);
       ar1.addAll(ar);
        System.out.println(ar1);
        ar.addLast(null);
        ar.addFirst(null);
        System.out.println(ar);

     ar.remove(0);         // index out of bound
        System.out.println(ar1);
        ar.removeFirst();    // no such
        ar.removeLast();     // no such
        boolean b = ar1.removeAll(ar);

        //ar.remove(true);          // object and index based
        //System.out.println(ar);
        ar.removeAll(ar1);      // different value will show
         ar.retainAll(ar1);        // same value only show


        System.out.println(ar.get(3)); // index based get/ index Out of bounds
        System.out.println(ar.getFirst()); // first/no such element
        System.out.println(ar.getLast());  // last/no such element


        ar.set(0,"Vijay"); // index ,object/ index out of bound
        System.out.println(ar);
        System.out.println(ar.equals(ar1));  // true or falls
        ar.clear();          // clear all element return empty array

        System.out.println(ar.size());// return length
        System.out.println( ar.subList(0,3));  // n-1 10,20,30



        ar.trimToSize();   // doubt
        ar.ensureCapacity(15);//  */

        System.out.println(ar.reversed());   // object has been print in reverse

        System.out.println(ar);


    }
}
