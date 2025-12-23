package problemsolving.numberproblems;

public class EvenAdd {
    static void addEvenNo(int s,int e){
        int sum = 0;
        System.out.println("Even Numbers are: ");
        for(int i = s;i <= e; i++){
            if(i%2 == 0){
             sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println("Even numbers sum: "+ sum);
    }

    public static void main(String[] args) {
        addEvenNo(1,20);
    }
}
