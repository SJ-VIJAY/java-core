package wrapperClass;
 class Wrapper {
    void in() {
        int a = 10;

        Integer a1 = a;          //  implicit conversion Auto boxing
        System.out.println("Integer AutoBoxing implicit: " + a1);
        Integer a2 = Integer.valueOf(a);// Manual conversion boxing
        System.out.println("Explicit conversion boxing: " + a2);


        Integer iQ = Integer.valueOf(1);
        int iq1 = iQ.intValue();        //unboxing
        System.out.println("Explicit unboxing: " + iq1);

        Integer iI = 123;
        int iO = iI;//   auto unboxing
        System.out.println("implicit auto unboxing: "+iO);

    }
    void by(){
        byte b = 123;

        Byte b1 = Byte.valueOf(b);
        System.out.println("Explicit conversion boxing: "+b1);
        Byte b2 = b;
        System.out.println("implicit conversion Auto boxing: "+b2);

        Byte b3 = Byte.valueOf((byte)123);

    }

}
public class Practice1 {
    public static void main(String[] args) {
        Wrapper w = new Wrapper();

        //w.in();
        w.by();


    }
}
