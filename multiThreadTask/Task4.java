package multiThreadTask;

class TicketSoldOutException extends RuntimeException {
    public TicketSoldOutException(String msg) {
        super(msg);
    }
}

class Ticket {
    static int ticket = 50;

    synchronized void ticketBook(String name, int ticBook) {
        System.out.println("Hi.."+name+" Welcome to INOX MULTIPLEX Theater.....");
        System.out.println("Movie name: CAPTAIN AMERICA");

        try {
            Thread.sleep(1000);
            if (ticBook <= ticket) {
                System.out.println(name + " is trying to book " + ticBook + " tickets...");
                Thread.sleep(1000);
                System.out.println("Tickets booked successfully by " + name );
                Thread.sleep(1000);
                System.out.println("you have booked: "+ticBook+" Tickets");
                ticket =ticket-ticBook;
                System.out.println("Enjoy your movie...");
               // System.out.println("Balance Tickets: " + ticket);
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            } else {
                throw new TicketSoldOutException("The show is HouseFull. Not enough tickets for " + name);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Screen extends Thread {
    Ticket ti;
    String name;
    int ticBook;

    public Screen(Ticket ti, String name, int ticBook) {
        this.ti = ti;
        this.name = name;
        this.ticBook = ticBook;
    }

    @Override
    public void run() {
        ti.ticketBook(name, ticBook);
    }
}

public class Task4 {
    public static void main(String[] args) {
        Ticket ti = new Ticket();

        Screen s1 = new Screen(ti, "Vijay", 5);
        Screen s2 = new Screen(ti, "Gokul", 15);
        Screen s3 = new Screen(ti, "Vinu", 20);
        Screen s4 = new Screen(ti, "Seenu", 5);
        Screen s5 = new Screen(ti, "Tamizh", 10);

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
    }
}