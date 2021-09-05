
import java.util.Arrays;

public class solution {
    //if noble integer is found return it, else return -1.
    public static int nobleInteger (int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        //if noble integer is found return it before last iteration.
        for(int i = 0; i < n - 1; i++) {
            //in case of duplicates values in arr.
            if(arr[i] == arr[i + 1]) {
                continue;
            }
            //in case we found noble integer, return it instantly.
            if(arr[i] == n - i - 1) {
                return arr[i];
            }
        }
        //in case of all the elements are negative integers except the last index return 0.
        if(arr[n-1] == 0) {
            return arr[n-1];
        }
        return -1;
    }

    //Main
    public static void main(String args[]) {
        int[] arr = {7,3,16,10};
        int result = nobleInteger(arr);
        if(result != -1){
            System.out.println("The Noble Integer Is " + result);
        }
        else {
            System.out.println("No Noble Integer Found ");
        }
    }
}
