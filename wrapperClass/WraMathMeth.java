package wrapperClass;

public class WraMathMeth {
   // wrapper class methods.

private static int sum(int x ,int y){
       return x+y;
   }
 private  static int compare(int a ,int b){
       if(a == b){
          return 0;
       } else if (a > b) {
           return 1;
       }else {
          return -1;
       }
   }
   private static  int min(int a,int b){
       if(a < b){
          return a;
       }
       else {
           return b;
       }
   }
    private static  int max(int a ,int b){
        if(a > b){
          return a;
        }
        else {
           return b;
        }
    }
    private static boolean isDigit(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        }
       return false;
    }
    private static boolean isLetter(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            return true;
        }
        return false;
    }

    // Maths class methods

  private static int abs(int a){
//    if(a < 0){
//        return -a;
//    }
//    return a;

      return (a < 0?-a:a);
  }
  private static void floor(double d){
    int floor = (int)d;
    float ans =  floor;

      System.out.println("Floor value: "+ans);

  }
    private static int power(int q, int p) {
        int pow = 1;
        for (int i = 0; i < p; i++) {
            pow = pow*q;
        }
        return pow;

    }
    private static void squareRoot(int num){
        boolean boo = false;
        int i;
        for( i = 0; i*i <= num;i++){
            if(i*i == num){
                boo = true;
            }
        }
        if(boo){
            System.out.println(i);
        }else{
            System.out.println("Not a Square Root");
        }
    }

    public static void main(String[] args) {
        // wrapper class methods.
//        System.out.println("Wrapper methods....");
//        System.out.println("Adding 2 values: "+sum(10,20));
//        System.out.println("Compare To: "+compare(10,20));
//        System.out.println("Min value: "+min(20,10));
//        System.out.println("Max value: "+max(20,10));
//        System.out.println("Is Digit or not: "+isDigit('@'));
      //  System.out.println(">>>>>>>>>>>>>>");

        // Math class methods
//
//        System.out.println("Math class methods....");
//       System.out.println("Absolute value: "+abs(-100));
//       floor(22.56);
         System.out.println("Power value: "+power(3,4));
         squareRoot(144);

    }

}
