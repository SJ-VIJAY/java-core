package threads;

class Thread1 extends Thread{


    public void run(){
        for(int i =1;i<= 50;i++){
            System.out.println( Thread1.currentThread().getName());
        }
    }

}
class Thread2 extends Thread{
    public void run() {
        for (int i = 1; i <= 50; i++) {

            System.out.println(Thread1.currentThread().getName());
        }
    }

}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        int [] ar ={1,2,3,4,5,6,7,8,9,10};
        int  max = ar[0];
        int i =0;
        while (i<ar.length) {
            if(ar[i] > max){
                max = ar[i];
            }
            i++;
        }
        System.out.println("Maximum number in array: "+max);
    }
}


public class Task1Thread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.setName("vinu");
        Thread2 t2 = new Thread2();
        t2.setName("Gokul");
        MyRunnable mr = new MyRunnable();
        Thread t3 = new Thread(mr);

        t1.start();
        t2.start();
        t3.start();
    }
    }

