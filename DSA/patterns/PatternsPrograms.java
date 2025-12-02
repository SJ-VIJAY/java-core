package DSA.patterns;


class Pattern {
    static void patternA() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternB() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void patternC() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternD() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }

    static void patternE() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int value = (i + j + 1) % 2;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    static void patternF() {
        int n = 5;
        int value = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }

    static void patternG() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - (i - 1); j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void patternH() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((n - i + 1) + " ");
            }
            System.out.println();
        }
    }

    static void patternI() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void patternI2() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void patternJ() {
        int n = 5;
        for (int i = 1; i <= (n * 2) - 1; i++) {
//             int k = i > n ? (n * 2) - i: i;
            int k = Math.min(i, n * 2 - i);
            for (int j = 1; j <= k; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }

    static void patternK() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "+" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void patternL(){
        int n = 5;
        for(int i = 1 ; i <= n ; i++ ){
            for(int j = 1; j <= i-1 ; j++) {
                System.out.print("-"+" ");
            }
            for(int k = 1 ; k <= n - i + 1 ; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void patternM(){
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("-"+" ");
            }
            for(int k = 1; k <= (i * 2) - 1; k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
public class PatternsPrograms {
    public static void main(String[] args) {
        //Pattern.patternA();
        //Pattern.patternB();
        //Pattern.patternC();
        //Pattern.patternD();
       // Pattern.patternE();
//        Pattern.patternF();
//        Pattern.patternG();
//        Pattern.patternH();
//        Pattern.patternI();
//        Pattern.patternI2();
//        Pattern.patternJ();
//        Pattern.patternK();
//        Pattern.patternL();
          Pattern.patternM();
    }
}
