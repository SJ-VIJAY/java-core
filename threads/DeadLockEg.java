package threads;

// here we use all the methods in synchronized so deadlock
// at least one method without synchronized the methods will be worked properly
class Dead1{
    synchronized void method1(Dead2 d2){
        System.out.println("method 1 calling..");
        d2.method4();
    }
     void method2(){
        System.out.println("method 2 calling..");
    }
}
class  Dead2{
    synchronized void method3(Dead1 d1){
        System.out.println("method 3 calling..");
        d1.method2();
    }
    synchronized void method4(){
        System.out.println("method 4 calling..");
    }

}
class One extends Thread{
    Dead1 d1;
    Dead2 d2;
   public One(Dead1 d1,Dead2 d2){
       this.d1 = d1;
       this.d2 = d2;

    }
    public void run(){
        d1.method1(d2);
    }

}
class Two extends Thread{
    Dead1 d1;
    Dead2 d2;
    public Two(Dead1 d1,Dead2 d2){
        this.d1 = d1;
        this.d2 = d2;

    }
    public void run(){
        d2.method3(d1);
    }
}

public class DeadLockEg {
    public static void main(String[] args) {
      Dead1 d1 = new Dead1();
      Dead2 d2 = new Dead2();

      One t1 = new One(d1,d2);
      Two t2 = new Two(d1,d2);

      t1.start();
      t2.start();
    }
}
