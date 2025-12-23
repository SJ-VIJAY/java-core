package problemsolving.numberproblems;

public class leapYear {

    static void isLeap(int n){
        if(n%400 == 0 || (n%4 == 0 && n%100 != 0)){
            System.out.println(n+" is leap year");
        }else System.out.println(n+" is not a leap year");
    }
    public static void main(String[] args) {
        isLeap(2024);
    }
}
