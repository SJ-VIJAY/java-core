package collection;

import java.util.*;

public class collectionsMethods {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.addAll(Arrays.asList(24,14,33,22,20,22,20,20));// add multiple elements using asList

       System.out.println(al);

        //Collections.sort(al); // sorting in ascending order
        //Collections.reverse(al);  // reverse the original values we sort and reverse in descending order

        //Collections.sort(al,Comparator.reverseOrder());  // sorting in reverse order
        //Collections.sort(al,Comparator.naturalOrder());  // sorting  in natural order

//        System.out.println(Collections.min(al));// return the minimum value
//        System.out.println(Collections.max(al));// return the maximum value

//        System.out.println(Collections.min(al,Comparator.naturalOrder()));  // natural order first value
//        System.out.println(Collections.min(al,Comparator.reverseOrder()));  // reverse order first value return

// in binary search we first do the sorting for correct index wil return or negative index return
//        Collections.sort(al);
//        System.out.println( Collections.binarySearch(al,24)); // if value present return the index
//        System.out.println(Collections.binarySearch(al,40));// else return the (-) negative index value return
        //System.out.println(Collections.binarySearch(al,24,Comparator.naturalOrder())); // 3 para meter list+value+Comparator

        // Collections.emptyList();  // waste of time how will work

//        List<Integer> list = new ArrayList<>(al);
//        System.out.println(list);
//
//        list.addAll(Arrays.asList(100,200,300));
//        System.out.println(list);
// synchro method return the list so we store into (li)
//        List<Integer> synList = Collections.synchronizedList(al);  // synchronized the list data
//        System.out.println(synList);

//        List<Integer> unMod = Collections.unmodifiableList(al); // we cannot change or add any data using un modify
//        System.out.println(unMod);
//        unMod.add(10);
//        System.out.println(unMod);

//        ArrayList<Integer> al1 =new ArrayList<>();
//        al1.add(100);al1.add(200);
//        // copy from one list to another list
//        Collections.copy(al,al1);// destination ,from source
//        System.out.println(al1); // copy change the original data old value remove new value added
//        System.out.println(al);

//        System.out.println(Collections.nCopies(4,"Vijay")); // how many times print the object
//        List<Integer> lis = Arrays.asList(1,2,3);
//        System.out.println(lis);

       //Collections.shuffle(al);  //shuffle the all elements....
//        System.out.println(al);

        System.out.println(Collections.frequency(al,22));  // object how many times will print
        //Collections.fill(al,0); // all element will be 0
        Collections.swap(al,0,2); // swap the value index based<>
        System.out.println(al);















    }
}
