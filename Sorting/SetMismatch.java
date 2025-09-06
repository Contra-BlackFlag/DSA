package Sorting;
import java.util.*;
public class SetMismatch {
    public static void main(String[] args) {
        int arr[] = {1,2,2,4};
        
        System.out.println(Arrays.toString(Sort(arr)));
    }
     static int[] Sort(int[] arr){
        int[] ans = new int[2];
        int i = 0;
        while (i<arr.length) {
            int correct = i;
            if (arr[i]>arr.length) {
                arr[i] = arr[i];
                
            }
            else correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                if (arr[i]>arr.length) {
                   
                }
              else { int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;}
            }
            else i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans[0] = arr[j];
                ans[1] = j+1;
                break;
            }
        }
        return ans;
    }
}
