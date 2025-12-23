package problemsolving.arrayProblems;

public class AddTwoArrayInOne {

    static void InOne(){
        int [] a = new int[5];
        int [] b = new int[5];
        int [] c = new int[5];
    int num = 5;
        for(int i = 0; i < 5; i ++){
            a [i] = i;
        }
        for(int i = 0; i < 5; i ++){
            b [i] = num;
            num++;
        }

        System.out.print("Value of a: ");
        for (int i = 0; i < 5; i ++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.print("Value of b: ");
        for (int i = 0; i < 5; i ++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < 5 ;i ++){
            c[i] = a[i] + b[i];
        }

        System.out.print("Value of c: ");
        for (int i = 0; i < 5; i ++){
            System.out.print(c[i]+" ");
        }

    }

    public static void main(String[] args) {
           InOne();
    }
}
