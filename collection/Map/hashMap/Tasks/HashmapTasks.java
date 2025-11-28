package collection.Map.hashMap.Tasks;

import java.util.*;

/*1.Find First Repeated Character in String.
        2.Find First Non-Repeated Character in String.
        3.Count frequency of words in a string using HashMap.
4.Count frequency of character in a string using HashMap.
5.Sort hashmap by key.
        6.Sort hashmap by values.*/
public class HashmapTasks {

    void  task1(){
        HashMap<Character,Integer> hm = new HashMap<>();

        String st = "bsssanana";
        char [] chars = st.toCharArray();
        char firstRepeat = '\0';

        for (char ch : chars){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
                if(firstRepeat == '\0'){
                    firstRepeat = ch;
                }
            }else {
                hm.put(ch,1);
            }
        }
        if(firstRepeat != '\0'){
            System.out.println("First repeating character: "+firstRepeat);
        }else{
            System.out.println("no repeating character found...");
        }
    }
    void task2(){
        HashMap<Character,Integer> hm = new HashMap<>();

       String st = "java";

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
    void task3(){
        HashMap<String,Integer> hm = new HashMap<>();
         int wordCount = 0;
        String st = "java is the best programming language";
       String [] words = st.split(" ");

        for(String word : words){
           hm.put(word,hm.getOrDefault(word,0)+1);
        }
        System.out.println("word count was: "+ hm);

    }
    void task4(){
        HashMap<Character,Integer> hm = new HashMap<>();

        String st = "fullstack";
        for(char ch : st.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        System.out.println("Characters count was: "+hm);
    }
    void task5(){
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(103, "Apple");
        hm.put(200, "Banana");
        hm.put(100, "Orange");
        hm.put(500, "Grapes");

        System.out.println("Original order: " + hm);
        TreeMap<Integer, String> sort = new TreeMap<>(hm);
        System.out.println("Sorted by Key: " + sort);
    }

    void task6(){
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Apple");
        hm.put(200, "Zebra");
        hm.put(100, "Orange");
        hm.put(500, "Banana");

        System.out.println("Original order: " + hm);
        List<Map.Entry<Integer,String>> list = new ArrayList<>(hm.entrySet());

        list.sort(Map.Entry.comparingByValue());
        System.out.println("Sorted by values: " + list);
        System.out.println(list.reversed());
    }


    public static void main(String[] args) {
         HashmapTasks hm = new HashmapTasks();

         hm.task6();
       //hm.task1();
       // hm.task2();
        //hm.task3();
//        hm.task4();
//        hm.task5();
    }

}