package collection.list;

import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add("Vijay");
        li.add(true);
        li.add(10);
        li.add(20);
        li.add(2.33);
        li.add(null);
        li.add(false);

        LinkedList li2 = new LinkedList();

        li2.add("Vijay");
        li2.add(true);
        li2.add(10);
        li2.add(20);
        li2.add(2.33);
        li2.add(null);
        li2.add(false);


     /*  li.offer(false);  // add in last
        li.offerFirst(true);   // add in first
        li.offerLast(true);



        li.poll();   // remove first if list empty return null
        li.pollFirst(); // remove first if list empty return null
        li.pollLast();     //remove last if list empty return null

        System.out.println(li.set(0,"vinu"));  // set return the old value in printing statement


        System.out.println(li.peek()); // return first value if list empty return  null
        System.out.println(li.peekFirst()); //return first value if list empty return  null
        System.out.println(li.peekLast()); //return last value


        System.out.println(li.removeFirstOccurrence("Vijay")); // if value is their return true/false
                                                      // and remove first value
//        li.offerLast(false);
//        System.out.println(li);
//        System.out.println(li.removeLastOccurrence("false"));


        System.out.println(li.peek());// first value get/ is empty return  null
        System.out.println(li.peekFirst()); // first value get/ is empty return  null
        System.out.println(li.peekLast()); // last value get/ is empty return  null */

        System.out.println(li);
        System.out.println(li.pop()); // return first value/if list is empty no such element will throw



    }
}
