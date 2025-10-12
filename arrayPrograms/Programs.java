package arrayPrograms;




//Copy one array into another.
//
//Find the average of array elements.
//
//Search for a particular element in the array.
//
//Check if the array contains a duplicate value.

public class Programs {
        //Store 10 numbers in an array and calculate their sum.
        static void pro2(){
            int [] ar = {1,2,3,4,5,6,7,8,9,10};
            int sum =0;
            for(int i =0;i<ar.length;i++){
                sum += ar[i];
            }
            System.out.println("sum of an array: "+sum);

        }
        // Find the largest number in an array.

        static  void pro3(){

            int [] ar = {20,2,3,4,5,6,7,8,9,100};
            int max = 0;
            for(int i =0;i<ar.length;i++){
                if(ar[i] > max) {
                    max = ar[i];
                }

            }
            System.out.println("Max num in array: "+max);

        }
        //Find the smallest number in an array.
        static  void pro4() {

            int[] ar = {20, 2, 3, 4, 5, 6, 7, 8, 9, 100};

            int min =ar[0];
            for(int i = 0;i<ar.length;i++){
                if(ar[i] < min){
                    min = ar[i];
                }
            }
            System.out.println("Min value in array: "+min);


        }
        //Count how many even and odd numbers are in the array.
    static  void pro5() {

        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,12,14};
        int evenCount =0;
        int oddCount = 0;

        for(int i = 0;i<ar.length;i++){
            if(ar[i]%2 == 0){
               evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even count in array: "+evenCount);
        System.out.println("Odd count  in array: "+oddCount);


    }
    //Print array elements in reverse order.
    static  void pro6() {

        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14};
        System.out.println("Reverse an array...");
        for (int i = ar.length-1; i >= 0; i--) {
            System.out.println(ar[i]);
        }
    }
    //Copy one array into another.
    static  void pro7() {

        int[] orig = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14};
        int [] copy = new int[orig.length];
        for (int i = 0; i < orig.length; i++) {
           copy[i] = orig[i];
        }
        System.out.println("Copy of an array....");
        for (int i =0;i<copy.length;i++){
            System.out.println(copy[i]);
        }
    }
    public static void main(String[] args) {
        //pro2();
        //pro3();
       // pro4();
        //pro5();
        //pro6();
        //pro7();
    }
}


