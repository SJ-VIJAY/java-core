package collection.programes;

/*1. Find the second-largest element in the arraylist.
 2.Sort the List of Strings in descending order based on length. anything
3.Using Map find the frequency of each character.
 4.Using Map to find the first non-repeating character in a string.
5.Using Map to find the duplicates values in the given Array.
6.Find Strings Which Start With Number in the LinkedList.*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


class CollTask {

    void meth1() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(21);
        al.add(19);
        al.add(23);
        al.add(24);
        al.add(25);

        System.out.println("Normal List: " + al);

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < al.size(); i++) {
            int num = al.get(i);
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("First largest: " + first);
        System.out.println("Second largest: " + second);
    }
     //Sort the List of Strings in descending order based on length
     void meth2(){
         ArrayList<String> al = new ArrayList<>();
         al.add("Vijay");  al.add("Ajay");  al.add("Joh");

         for(int i =0;i<al.size();i++){
             for(int j=i+1;j< al.size();j++){
                 if(al.get(i).length() < al.get(j).length()){
                    String temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j,temp);
                 }
             }

         }
         System.out.println(al);

     }
     void meth3(){
         HashMap<Character,Integer> hm = new HashMap<>();

         String st = "fullstack";
         for(char ch : st.toCharArray()){
             hm.put(ch,hm.getOrDefault(ch,0)+1);
         }
         for(Map.Entry<Character,Integer> count:hm.entrySet()){
             System.out.println(count);
         }
     }
     void meth4(){
         HashMap<Character,Integer> hm = new HashMap<>();

         String st = "Program";

         for (char ch : st.toCharArray()){
             hm.put(ch,hm.getOrDefault(ch,0) + 1);
         }
         char firstNonRepeat = '\0';
         for(char ch : st.toCharArray()){
             if(hm.get(ch) == 1 ){
                 firstNonRepeat = ch;
                 break;
             }
         }
         if (firstNonRepeat != '\0') {
             System.out.println("First non repeated character: "+firstNonRepeat);
         } else {
             System.out.println(" non repeated character not found");
         }
     }


}
public class Tasks {
    public static void main(String[] args) {
        CollTask ct =new CollTask();

       // ct.meth1();
//        ct.meth2();
//        ct.meth3();
        ct.meth4();

    }
}
