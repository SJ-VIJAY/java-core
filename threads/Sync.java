package threads;

class A {

    // here Different object we use static synchronized(Class level)
    // same object we use synchronized(object level)
   public  static synchronized void show(String name){
         for(int i=1;i<=5;i++) {
             System.out.print("Welcome");

             try {
                 Thread.sleep(500);
             } catch (Exception e) {
                 System.out.println(e+"");
             }

             System.out.println(name);
         }
    }

}
class User extends Thread{
     A ob;
     String name;
     public User(A ob,String name){
     this.ob =ob;
     this.name = name;

    }
       public void run(){
        ob.show(name);
    }

}
public class Sync {
    public static void main(String[] args) {
       A ob = new A();
   A ob1 = new A();
   A ob2 = new A();
        User u1 = new User(ob," User 1");
        User u2 = new User(ob1," User 2");
        User u3 = new User(ob2," User 3");
        u1.start();
        u2.start();
        u3.start();

    }
}
