package collection.list;



import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.add("vijay");
        st.add(10);
        st.add(20);
        st.add(true);
        st.add(10.22);


       // System.out.println(st.peek()); // return the last element /empty stack exception
       // System.out.println(st.pop());  // remove the last element
        System.out.println(st);
       // System.out.println(st.push("Vinu")); //add the element in last

       // st.addFirst("vv");
        System.out.println( st.search("vijay"));
        System.out.println(st.empty());
        System.out.println(st);






    }
}
