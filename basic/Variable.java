package basic;

public class Variable {

        byte a = 10 + 10;
        short b = 200 + 1;
        int c = 3000;
        long d = 67778;
        float e = 44.76f;
        double f = 6664.4884d;
        char g = 'g';
        boolean h = true;


        public static void main(String[] args) {

                Variable obj = new Variable();
                System.out.println(obj.a / obj.b);
                System.out.println(obj.b + obj.c + 55 * 3);
                System.out.println(obj.d - 134 + 23);
                System.out.println(obj.e / 3 + 5);
                System.out.println(obj.f + obj.e - 54.5);
                System.out.println(obj.g + 1);
                System.out.println(obj.h);


        }


}