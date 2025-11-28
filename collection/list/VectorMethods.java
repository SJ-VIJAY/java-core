package collection.list;

import java.util.Vector;

public class VectorMethods {
    public static void main(String[] args) {
        Vector ve = new Vector(10,1);
      //  System.out.println(ve.capacity());

        ve.add("Vijay");
        ve.add(true);
        ve.add(10);
        ve.add(20);
        ve.add(22.33);
        ve.add('V');


        Vector ve1 = new Vector(); // initial capacity and increment capacity

        ve1.add("Vignesh");
        ve1.add(true);
        ve1.add(10);
        ve1.add(20);
        ve1.add(22.33);
        ve1.add('V');

        ve1.setSize(54);

        ve1.ensureCapacity(120);

        System.out.println(ve1.capacity());


        /*System.out.println(ve1);
//        ve.add(2,true);
//        ve.addAll(0,ve1);


        System.out.println(ve);
        ve.addElement("Vijay"); // add in last object
        System.out.println(ve.removeElement(true)); // remove the object and return boolean
        ve.removeAllElements();// remove the all elements like clear method return empty array[]
        ve.removeElementAt(1); // remove index based / array index out of bounds exception
        System.out.println(ve.firstElement());// return first element / no such element except
        System.out.println(ve.lastElement()); // return last elements / no such exp


        System.out.println(ve.capacity()); // return the current capacity
        System.out.println(ve.size());   // return the object length
        ve.ensureCapacity(50);  // capacity fixer
        System.out.println(ve.capacity());


        System.out.println(ve.elementAt(3));// get the index based value / array index out
        System.out.println(ve.contains(false)); // return the boolean if their
        System.out.println(ve.containsAll(ve1)); // this also return the boolean value
        System.out.println(ve);
          ve.setElementAt(33.44,0); // set the element old value remove new value add
      ve.setSize(10); // we set the size value is not in their the all value become null*/
        //System.out.println(ve.size());
        //System.out.println(ve);

    }


}
