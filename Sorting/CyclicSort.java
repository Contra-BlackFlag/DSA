package Sorting;
import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2,6,0};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr){
        int i = 0;
        while (i<arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else i++;
        }
    }
}
