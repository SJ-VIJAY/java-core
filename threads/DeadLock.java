package threads;

class DeadLock1 extends Thread{
    Object person1;
    Object person2;
   public DeadLock1(Object lock1,Object lock2){
       this.person1 =lock1;
       this.person2 = lock2;
   }
   public void run() {

       // Deadlock will happen only nested synchronize
       System.out.println(Thread.currentThread().getName()+"Thread started");
       synchronized (this.person1) {
           System.out.println("First person was entered in room..");

           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               System.out.println();
           }
           System.out.println("First person was exit from room");
           synchronized (this.person2) {
               System.out.println("Second Person was entered in room..");
           }
           System.out.println("Second Person was exit from room..");
           System.out.println(Thread.currentThread().getName()+"Thread started");
       }
   }


}
class DeadLock2 extends Thread{
    Object person1;
    Object person2;
    public DeadLock2(Object person1 ,Object person2 ){
        this.person1 = person1 ;
        this.person2 = person2;
    }
    public void run() {

        // Deadlock will happen only nested synchronize
        System.out.println(Thread.currentThread().getName() + "Thread started");
        synchronized (this.person2) {
            System.out.println("Second person was entered in room..");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println();
            }
            System.out.println("Second person was exit from room");
            synchronized (this.person1) {
                System.out.println("First Person was entered in room..");
            }
            System.out.println("First Person was exit from room..");
            System.out.println(Thread.currentThread().getName() + "Thread started");
        }
    }
}

public class DeadLock {
    public static void main(String[] args) {
        Object person1 = new Object();
        Object person2 = new Object();

        DeadLock1 dl1 = new DeadLock1(person1,person2);
        DeadLock2 dl2 = new DeadLock2(person1,person2);

        dl1.start();
        dl2.start();

    }
}
