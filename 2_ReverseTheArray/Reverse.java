/*Given an array (or string), the task is to reverse the array/string.
Examples : 
 

Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4} */

public class Reverse {

    static void reverse(int arr[], int n){
        int l[] = new int[n];

        //Reversing
        for (int i=0; i<n; i++){
            l[i] = arr[n-i-1];
        }
        
        //Output
        for (int i=0; i<n; i++){
            System.out.print(l[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = 6;

        reverse(arr, n);
    }
}
