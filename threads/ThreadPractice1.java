package threads;



class Theater{
    int ticketPrice =0;
    public void ticketBook(){
        ticketPrice++;   //
    }

}
class Person1 extends Thread{
    Theater th;
    String movieName;
    public Person1(Theater th,String movieName){
        this.th = th;
        this.movieName = movieName;
    }
    public void run(){
        for(int i =1;i<=1000;i++){
           th.ticketBook();
        }
    }


}
class Person2 extends Thread{
    Theater th;
    String movieName;
    public Person2(Theater th,String movieName){
        this.th = th;
        this.movieName = movieName;
    }
    public void run(){
        for(int i =1;i<=1000;i++){
            th.ticketBook();
        }
    }
}


public class ThreadPractice1 {
    public static void main(String[] args) {
        Theater th = new Theater();
        Person1 p1 = new Person1(th,"Touriest");
        Person2 p2 = new Person2(th,"Jana Nayagan");
        System.out.println(Thread.currentThread().getName());
        System.out.println("before start method: "+th.ticketPrice);
        p1.start();
        p2.start();

        try{
            p1.join();
            p2.join();
        }catch (InterruptedException e) {
            System.out.println("Exception Caught");

        }
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Movie Ticket price is: "+th.ticketPrice);
    }
}
