package collection;

import java.util.ArrayList;

import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Vijay");
        al.add("Vinu");
        al.add("Vicky");
        al.add("seenu");
        al.add("Tamizh");

//        // 1 st way

//        System.out.println("Normal way....");
//        System.out.println(al);
//        al.add("Parthi");
//        al.set(2, "Suresh");
//        al.remove(0);
//        System.out.println(al);
//        System.out.println(">>>>>>>>>");

//         2 nd way with For loop

//        System.out.println("For loop....");
//        System.out.println(al);
//        in for loop we use with cond add, with set and remove
//

        // 3 rd way with For each loop(enhanced )
        // we cannot use add,set,remove because in for each only we print
        // so we get Concurrent Modification Exception..
//
//        System.out.println("For loop....");
//         for(String s : al){
//             System.out.println(s);
//         }
//
//        System.out.println(">>>>>>>>>");

//         4 th way with iterator

//        System.out.println("Iterator method....");
        //    Iterator<String > it = al.iterator();
//        while(it.hasNext()){

//            System.out.println(it.next());
//        }
//        System.out.println(">>>>>>>>>");

        //5 th way ListIterator here we give size because
        // listIterator method will move forward and backward
// and which index to go and back

//        System.out.println("ListIterator method....");
//        ListIterator <String> li = al.listIterator(al.size());
//        while(li.hasPrevious()){
//            System.out.println(li.previous());
   // }

        }

    }

