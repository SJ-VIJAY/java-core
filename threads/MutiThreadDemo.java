package threads;




class MyThreadClass3 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Value: " + i);
        }
    }
}
      class MyThreadClass4 implements Runnable{
          @Override
          public void run(){

              for(int i =1;i<=10;i++){

                  System.out.println(i+"x"+5+"="+(i*5));
              }
          }
      }
public class MutiThreadDemo {
    public static void main(String[] args) {

        System.out.println("Main start..");
        MyThreadClass3 m1 = new MyThreadClass3();// new
        System.out.println(m1.getState());
        m1.start();
        System.out.println(m1.getState());


        MyThreadClass4 m4 =new MyThreadClass4();
        Thread th = new Thread(m4);

        th.start();
      try {
            th.sleep(10);
        } catch (InterruptedException | IllegalThreadStateException e) {
            System.out.println("Exception caught..");
        }


    }


}
