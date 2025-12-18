package interThreadCommunication;

class Amazon extends Thread{
    int stock = 10;
    synchronized void buy(int count) throws InterruptedException{
        if (count <= stock) {
            System.out.println("Order placed ");
            wait();
            System.out.println("Balance stock= "+(stock-count));
        }else{
            System.out.println("waiting....");
            System.out.println("add in your cart..."+stock);
             wait();
            System.out.println("add in your cart..."+stock);
        }
    }
    synchronized void adding(){
        stock = stock+10;
       System.out.println("Stock Added..."+stock);
        notifyAll();


    }
}
public class InterTask2 {
    public static void main(String[] args) {
        Amazon am = new Amazon();

        Thread t1 = new Thread(){
            public void run(){
                try {
                    am.buy(15);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t2 = new Thread(){
            public  void run(){
                try{
                    am.buy(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        Thread t3 = new Thread(){
            public void run(){
                am.adding();
            }
        };
        t1.start();
        t2.start();
        t3.start();

    }
}
