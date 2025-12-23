package problemsolving.arrayProblems;

public class MissingNum {
    static int miss(int [] num){
        int n = num.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += num[i];
        }
        int res = n*(n+1)/2 -sum;
        return res;
    }
    public static void main(String[] args) {
        int [] ar = {0,2,3,4};
        System.out.println(miss(ar));
    }
}
