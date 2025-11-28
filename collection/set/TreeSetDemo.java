package collection.set;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // 5 constructors in Tree Set

// not allow the duplicate value
        // maintain the ascending  order
        // null value can't store throw null pointer
        // homogeneous data only stored if try to store
        // class cast Exp will throw
        // add first and add last not work in Tree set throw unsupportedExp

        TreeSet ts = new TreeSet();




        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(40);
        ts.add(50);

//       Iterator itr = ts.descendingIterator();
//       while(itr.hasNext()){
//           System.out.println(itr.next());
//
//       }

//        System.out.println(ts);
//        System.out.println(ts.pollFirst()); // first value remove
//        System.out.println(ts.pollLast()); // last value will remove
//
//        System.out.println(ts.first()); // first value return set empty NOSuchElement exp
//        System.out.println(ts.last()); // last value return set empty NOSuchElement exp
//
//        System.out.println(ts.getFirst());
//        System.out.println(ts.getLast());
//
// //if we give 40 return the 30...or null return
        System.out.println(ts);
      System.out.println(ts.lower(20)); // lower provide small value than object
        System.out.println(ts.higher(10));// high value or null suppose lat

//
//       System.out.println(ts.headSet(30)); // 30 before value return
//        System.out.println(ts.headSet(50,false)); // 40 with before value
//
//        System.out.println(ts.tailSet(20)); // 20 with after value return
//        System.out.println(ts.tailSet(30,false)); // true inclusive object / false without object

      System.out.println(ts);
        System.out.println(ts.ceiling(40)); // object next big value return or return the object
        System.out.println(ts.floor(50)); // if

    }
}
