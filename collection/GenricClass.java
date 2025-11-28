package collection;

// Genric class

class Student <S>{

      S print;
    public Student (S print ){
      this.print = print;
    }
}
public class GenricClass {
    public static void main(String[] args) {

        Student<String> st = new Student<>("Vijay");
        System.out.println("Student Name: "+st.print);

        Student<Integer> st1 = new Student<>(112);
        System.out.println("Student id: "+st1.print);

        Student<Double> st2 = new Student<>(91.55);
        System.out.println("Student Result Percentage: "+st2.print+" %");

        Student<Character> st3 = new Student<>('A');
        System.out.println("Student Grade: "+st3.print);

        Student<Boolean> st4 = new Student<>(true);
        System.out.println("Student performance is good : "+st4.print);



    }
}
