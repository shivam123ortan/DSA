

public class SortedRotatedArray {

    static int atIndex(int arr[], int key){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low + high)/2;

            if (key == arr[mid]) return mid;

            if (arr[low] < arr[mid]){
                if (key >= arr[low] && key < arr[mid]){
                    high = mid - 1;
                } 
                else{
                    low = mid + 1;
                }
            }
            else{
                if (key > arr[mid] && key <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {80, 90, 100, 110, 30, 40, 50, 60};
        int key = 60;
        System.out.println("Index: " + atIndex(arr, key));
    }
    
}
