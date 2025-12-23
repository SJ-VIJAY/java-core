package threads;

class Amount{
    int amount=0;

    public void a1(){
        amount++;
    }

}
class ThreadRelation extends Thread{

    Amount amount;
    String name;
    public ThreadRelation(Amount amount, String name){
        this.amount=amount;
        this.name=name;
    }
    public void run(){
        for(int i=1;i<=900;i++){
            amount.a1();
           // System.out.println("T1-> "+amount.amount);
        }
    }
}
class ThreadRelation2 extends Thread{

    Amount amount;
    String name;
    public ThreadRelation2(Amount amount, String name){
        this.amount=amount;
        this.name=name;
    }
    public void run(){
        for(int i=1;i<=10000;i++){
            amount.a1();
          //  System.out.println("T2-> "+amount.amount);
        }
    }
}

public class ThreadUsingRelation{

    public static void main(String []args){
        Amount a=new Amount();
        ThreadRelation obj=new ThreadRelation(a,"java");
        ThreadRelation2 obj2=new ThreadRelation2(a,"py");
//ThreadRelation2 obj3=new ThreadRelation2(a,"py");
        System.out.println(a.amount);
        obj.start();
        obj2.start();
//obj3.start();
//        try{
//            //obj.join();
//           // obj2.join();
////obj3.join();
//        }catch(Exception e){
//            System.out.println(e);
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(a.amount);
}
}