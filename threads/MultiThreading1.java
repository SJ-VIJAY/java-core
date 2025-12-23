package threads;


    class MyThreadClass1 extends Thread{
        @Override
        public void run(){
            for (int i = 1; i <=100 ; i++) {
                System.out.println(i+" value");
            }
        }
        @Override
        public void start(){
            super.start();//it will call Thread class start()->run()
            this.run();//it will not act a Thread or Multi Thread...
        }
    }
    class MyThreadClass2 implements Runnable{
        @Override
        public void run(){
            for (int i = 1; i <=50 ; i++) {
                System.out.println(i+"*10 = "+i*10);
            }
        }
    }

    public class MultiThreading1 {
        public static void main(String[] args) {
            System.out.println("Main start");
            //if we create a Thread class Object
            //then it becomes New / Born state
            MyThreadClass1 t1 = new MyThreadClass1();
            System.out.println(t1.getState());
            //if we call a start()
            //then it becomes Runnable state
            t1.start();
            //if we call the start() My Thread will execute parallel
            //if we call the start() it will invoke run()
            System.out.println(t1.getState());
            System.out.println("Main end");
            //Once Run method is completed
            //the state will be terminated state
            System.out.println(t1.getState());

            //implements
            MyThreadClass2 obj = new MyThreadClass2();
            Thread tt = new Thread(obj);
            tt.start();//it will invoke run()
//        tt.start();//again start() the same thread means
            //we get IllegalThreadStateException
}
    }

