package problemsolving.arrayProblems;

public class MatrixDiagnalSum {
  static int sum(int [][] nums){
      int n = nums.length;

      int sum = 0;
      int i = 0;
      int j = 0;

      while(i < n){
          sum += nums[i][j];
          i++;
          j++;
      }
      i = 0;
      j = n - 1;
      while(i < n){
          if(i != j)
              sum += nums[i][j];
          i++;
          j--;
      }
      return sum;
  }
    public static void main(String[] args) {
        int [][] ar = { {1,2,3},
                        {4,5,6},
                        {7,8,9} };
        System.out.println(sum(ar));
    }
}
