import javax.naming.spi.DirStateFactory.Result;
import javax.sound.sampled.ReverbType;

/*A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are considered permutations of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory. */


public class NextPermutation {

    static void swap(int [] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    static void reverse(int [] arr, int i, int j){
        while (i<j){
            swap(arr, i++, j--);
        }
    }

    // Main Code
    static int [] next(int [] arr){
        if (arr == null || arr.length <= 1){
            return arr;
        }
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i+1]){
            i--;
        }
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]){
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i+1, arr.length - 1);
        return arr;
    }
    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 4, 2}; 
        int [] res = next(arr);
        for (int i : res){
            System.out.print(i + " ");
        }
    }
}
