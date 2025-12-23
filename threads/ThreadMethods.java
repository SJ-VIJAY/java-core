package threads;


import javax.sound.midi.Soundbank;

public class ThreadMethods extends Thread {

    public static void method1() {

        ThreadMethods t1 = new ThreadMethods();
        ThreadMethods t2 = new ThreadMethods();

        System.out.println("Thread 0 name: " + t1.getName());
        System.out.println("Thread 1 name: "+ t2.getName());
        System.out.println("After set name...");
        t1.setName("My Thread");
        t2.setName("My Thread1");
        System.out.println("Thread 0 name: "+t1.getName());
        System.out.println("Thread 1 name: "+t2.getName() );


        Thread t3 = new Thread();
         t3.setPriority(10);
        System.out.println(t3);
         t3.start();
        System.out.println("State of thread..."+t1.getState());

    }

    public static void main(String[] args) {
        method1();
    }

}
