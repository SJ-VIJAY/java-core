package multiThreadTask;
// Task 9 inter thread communication  shopping concept

class Shop {
    int cloths = 50;
     void order(int countOrder){
         if(cloths >= countOrder){
             System.out.println("Ordered was successfully done... ");
             cloths = cloths-countOrder;
             System.out.println("Remaining cloths: "+cloths);
         }else{
             try{
                 System.out.println("Waiting ....");
                 wait();
             }catch(Exception e){
                 System.out.println(e);
             }
             System.out.println("Ordered was successfully done after loaded..");
             cloths = cloths-countOrder;
             System.out.println("Remaining cloths after loaded: "+cloths);

         }
     }
     synchronized void loadCloths(int loadQty){
         System.out.println("cloths loaded was done...");
         cloths = cloths+loadQty;
         System.out.println("loaded Qty: "+cloths);
         notify();
     }
}
class Shopping extends Thread{
    Shop sp;
    public Shopping(Shop sp){
        this.sp = sp;
    }
    public void run(){
        sp.order(60);
    }

}
class ClothLoad extends Thread{
    Shop sp;
    public ClothLoad(Shop sp){
        this.sp = sp;
    }
    public void run(){
        sp.loadCloths(100);
    }
}
public class Task9 {
    public static void main(String[] args) {
        Shop sp = new Shop();

        Shopping t1 = new Shopping(sp);
        ClothLoad t2 = new ClothLoad(sp);

        t1.start();
        t2.start();

    }
}
