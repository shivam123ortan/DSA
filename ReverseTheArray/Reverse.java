public class Reverse {

    static void reverse(int arr[], int n){
        int l[] = new int[n];
        for (int i=0; i<n; i++){
            l[i] = arr[n-i-1];
        }
        // System.out.println(l[]);
        for (int i=0; i<n; i++){
            System.out.println(l[i]);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = 6;

        reverse(arr, n);
    }
}
