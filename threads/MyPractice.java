package threads;

class Empty extends  Thread {
    static int ticket = 50;

    synchronized void booking(String name, int count) {
        System.out.println("welcome " + name + " Tickets want " + count);
        if (count < ticket) {
            System.out.println("tickets booked successful");
        } else {
            System.out.println("the show is HouseFull");

        }
        System.out.println("Balance Tickets: " + (ticket - count));

    }
}
    class Screen extends Thread {
     Empty em;
     String name;
     int count;

     public Screen(Empty em,String name,int count){
         this.em = em;
         this.name = name;
         this.count = count;

     }

    public void run(){
        em.booking(name,count);
    }
}
public class MyPractice {
    public static void main(String[] args) {
        Empty em = new Empty();

        Screen  s1 = new Screen(em,"Vijay",10);
        Screen  s2 = new Screen(em,"vinu",50);

        s1.start();
        s2.start();

    }
}
