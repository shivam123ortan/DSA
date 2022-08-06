import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class ChoclateDist {
    static int findMinDiff(int [] arr, int n, int m){
        if (m==0 || n==0){
            return 0;
        }
        if(n<m){
            return -1;
        }
        Arrays.sort(arr);

        int min_diff = Integer.MAX_VALUE;
        for(int i=0; i+m-1<n; i++){
            int diff = arr[i+m-1] - arr[i];
            if(diff < min_diff){
                min_diff = diff;
            }
        }
        return min_diff;
    }
    public static void main(String[] args) {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
             
        int m = 7;  // Number of students
  
        int n = arr.length;
        System.out.println("Minimum difference is " + findMinDiff(arr, n, m));

    }
}
