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
        System.out.println(containDouble(arr));
    }    
}
