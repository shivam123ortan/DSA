/*Given an array of n integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.
Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
Output: Minimum Difference is 2 
Explanation:
We have seven packets of chocolates and 
we need to pick three packets for 3 students 
If we pick 2, 3 and 4, we get the minimum 
difference between maximum and minimum packet 
sizes. */

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
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
