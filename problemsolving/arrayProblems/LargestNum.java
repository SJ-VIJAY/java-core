package problemsolving.arrayProblems;

public class LargestNum {
    static void largeNum(){
        int [] arr = {100,231,9,34,45};
        int max = arr[0];
        for(int i = 0; i < arr.length ;i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest num in array: "+max);
    }

    public static void main(String[] args) {
        largeNum();
    }
}
