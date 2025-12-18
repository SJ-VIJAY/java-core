package interThreadCommunication;

class Anonymous {
    void m1(){
        System.out.println("M1 calling");
    }
    void m2(){
        System.out.println("M2 calling");
    }
}

public class InterTask1 {
    public static void main(String[] args) {
        Anonymous an = new Anonymous();
        Thread th1 = new Thread(){
            @Override
           public void run(){         // anonymous after curly braces we use (;)semicolon
               System.out.println("Hii");
              an.m1();
               an.m2();
           }
        };
        Thread th2 = new Thread(){
            @Override
            public void run(){
                System.out.println("Hii 2");
            }
        };
        th1.start();
        th2.start();
        an.m1();
    }
}
