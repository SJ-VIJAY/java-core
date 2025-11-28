package collection;


class CuAr{
    private  int size ;
    private  int capacity = 10;
    private  int [] array ;

    public  CuAr(){
        array = new int[capacity];
    }
    public int getSize(){
        return  size;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        for (int i =0 ;i<size;i++){
            System.out.print(array[i]+" ");

        }
        return  " ";
    }
    public boolean  add(int value){
       array[size++] = value;
       return  true;
    }


}

public class CustomArrList {
    public static void main(String[] args) {
        CuAr ca = new CuAr();
        System.out.println(ca.getSize());
        System.out.println(ca.getCapacity());
        System.out.println(ca);

        ca.add(10);
        ca.add(20);
        ca.add(30);
        ca.add(40);

        System.out.println(ca);
        System.out.println(ca.getSize());
        System.out.println(ca.getCapacity());

    }
}
