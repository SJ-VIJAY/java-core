package problemsolving.numberproblems;

public class SwapValue {
      static void swap(int a,int b){
          System.out.println("Before swap: a = "+a+", b = "+b);
          int c = a;
          a = b;
          b = c;
          System.out.println("Before swap: a = "+a+", b = "+b);
      }
      // swapping approach 2
    static void swap2(int a,int b){
        System.out.println("Before swap: a = "+a+", b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Before swap: a = "+a+", b = "+b);
    }
    public static void main(String[] args) {
        swap(40,30);
        swap2(40,30);
    }
}
