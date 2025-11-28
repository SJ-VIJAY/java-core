package collection.Tasks;

//1.find Maximum & Minimum In A List

import java.util.*;

class Main implements Cloneable{
    void task1 () {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(70);

        System.out.println(al);
        int max = 0;
        int min = 10000;
        for (Integer i : al) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }

        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println(">>>>>>>>>>>");

    }
  //  2.Sort The List In Reverse Order without in build method.
    void task2() {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(10);
        ll.add(60);
        ll.add(50);
        ll.add(20);
        ll.add(70);
        ll.add(30);
        ll.add(40);

        System.out.println("Before Sort: " + ll);
  for(int i =0;i<ll.size();i++){
      for(int j=0;j<ll.size();j++){
         if(ll.get(i) > ll.get(j)) {
           Integer temp = ll.get(i);
             ll.set(i, ll.get(j));
             ll.set(j, temp);
         }
      }

  }
        System.out.println("After sort: "+ll);
        System.out.println(">>>>>>>>>>>>>>>");
    }
    //3.Remove duplicates in arraylist

    void task3(){
        ArrayList<String> al = new ArrayList<>();

        al.add("Vijay");
        al.add("Vicky");
        al.add("Vinu");
        al.add("Vijay");
        al.add("Gokul");
        al.add("Gopi");
        al.add("Vijay");

        LinkedHashSet li = new LinkedHashSet(al);
        System.out.println("Before; "+al);
        System.out.println("After ;"+li);
        System.out.println(">>>>>>>>>>>");
    }
    //4.wajp to copy one array list into another.
    void task4(){
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        al.add(70);

        ArrayList al2 = (ArrayList) al.clone();
        System.out.println("before copy: "+ al);
        System.out.println("after copy: "+ al2);
        System.out.println(">>>>>>>>>>>>>");

    }
    void task5(){
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(60);
        al.add(50);
        al.add(20);
        al.add(70);
        al.add(30);
        al.add(40);

        ArrayList<Integer> al2= new ArrayList<>();

        al2.add(100);
        al2.add(300);
        al2.add(500);
        al2.add(400);
        al2.add(200);
        al2.add(600);
        al2.add(700);

        System.out.println("Array 1: "+al);
        System.out.println("Array 2: "+al2);
        al.addAll(al2);

        TreeSet ts = new TreeSet(al);
        System.out.println("After Sorted: "+ts);
    }

    //7.Sort List of Strings In ascending Order Of their Length based
    void task7(){

    }


}

public class Tasks{
    public static void main(String[] args) {

       Main m = new Main();
       m.task1();
        m.task2();
       m.task3();
       m.task4();
       m.task5();

    }
    }

