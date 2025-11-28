package collection.comparator$comparable;

import java.util.*;

public class UserClass implements Comparable<UserClass>{
    Integer studentId;
    String name;
   Integer age;
    String std;
    Character grade;

    public UserClass(int studentId, String name, int age, String std, char grade) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.std = std;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", std='" + std + '\'' +
                ", grade=" + grade +
                '}'+ '\n';
    }

    public int compareTo(UserClass ob) {
//        if (ob.studentId < studentId) {
//            return 1;
//        } else if (ob.studentId > studentId) {
//            return -1;
//        } else {
//            return 0;
//        }
        //return name.compareTo(ob.name);
//        return ob.id - this.id;
        //return this.grade.compareTo(ob.grade);
        return this.age - ob.age;

    }

    public static void main(String[] args) {
        ArrayList<UserClass> al = new ArrayList<>();
        al.add(new UserClass(112,"Vijay",15,"10 th",'A'));
        al.add(new UserClass(111,"Vinu",13,"9 th",'B'));
        al.add(new UserClass(110,"Gokul",16,"11 th",'A'));
        al.add(new UserClass(113,"Tamizh",12,"8 th",'C'));
        al.add(new UserClass(113,"Gopi",12,"8 th",'D'));

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

    }

}
