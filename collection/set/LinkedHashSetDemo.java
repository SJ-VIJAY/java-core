package collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // 4 constructors in Linked HashSet

        LinkedHashSet<String> lh = new LinkedHashSet<>();

        lh.add("apple");
        lh.add("banana");
        lh.add("cat");
        lh.add("dog");
        lh.add("zebra"); // will maintain the insertion order
        System.out.println(lh.size());

        System.out.println(lh);

//        lh.addFirst("book");  // add first
//        System.out.println(lh);
//        lh.addLast("onion"); // add last
//        System.out.println(lh);

        //System.out.println(lh.reversed()); // reversed method will work properly

//        System.out.println(lh.getFirst()); // get first value
//        System.out.println(lh.getLast()); //get last value
//        System.out.println(lh.getClass()); // get class ...

//        System.out.println(lh.removeFirst()); // remove first
//        System.out.println(lh.removeLast()); // remove last
//
//        System.out.println(lh.size()); // size get
//


    }
}
