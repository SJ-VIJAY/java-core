package arrayPrograms;

public class CopyArray {
    static void copyArr() {
        int[] orig = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14};
        int[] copy = new int[12];
        for (int i = 0; i < orig.length; i++) {
            copy[i] = orig[i];
        }
        System.out.println("Copy of an array....");

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }

    }
   static void meth1(){
        System.out.println("Debugging...");
    }
    public static void main(String[] args) {
       copyArr();
       meth1();
    }
}
