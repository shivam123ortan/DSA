/*
Given an integer array nums, return true if any 
value appears at least twice in the array, and 
return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

import java.util.*;
public class ConDub {
    static boolean containDouble(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(containDouble(arr));
    }    
}
