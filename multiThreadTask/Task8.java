package multiThreadTask;
//Task 8:
//create 4 thread and create a array length should be 25
//each thread will update 5 new values parallely or ?
//each thread will square the old values per thread square 5values?

class ArrayFill extends Thread {
    static int[] ar = new int[25];

    synchronized void updateArray(int start,int count) {

       for (int i = start;i < start+count; i++) {
           ar[i] = i*10;
        }
    }

}
class Update extends Thread{
    ArrayFill af;
   int start;
    int count;
    public Update(ArrayFill af,int start,int count){
        this.af = af;
        this.start = start;
        this.count = count;
    }
    public  void run(){
        af.updateArray(start,count);
    }
}


public class Task8 {
    public static void main(String[] args) {
        ArrayFill af = new ArrayFill();

        Thread t1 = new Update(af,0,5);
        Thread t2 = new  Update(af,5,5);
        Thread t3 = new  Update(af,10,5);
        Thread t4 = new  Update(af,15,5);
        Thread t5 = new  Update(af,20,5);

        t1.start();;
        t2.start();
        t3.start();
        t4.start();
        t5.start();


        for(int i = 0; i< ArrayFill.ar.length; i++){
            System.out.println(ArrayFill.ar[i]);

        }



    }

}

