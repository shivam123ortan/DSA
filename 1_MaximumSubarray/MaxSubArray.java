import java.util.*;

class MaxSubArray {
    static int maxSubArraySum(int a[]){

        int size = a.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
  
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(maxSubArraySum(a));
    }   
}