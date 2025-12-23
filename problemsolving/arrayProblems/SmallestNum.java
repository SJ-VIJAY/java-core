package problemsolving.arrayProblems;

public class SmallestNum {
    static void smallNum(){
        int [] arr = {100,231,9,34,45};
        int min = arr[0];
        for(int i = 0; i < arr.length ;i ++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest num in array: "+min);
    }

    public static void main(String[] args) {
        smallNum();
    }
}
