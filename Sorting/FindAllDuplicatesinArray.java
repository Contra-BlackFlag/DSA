package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesinArray {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        // Sort(arr);
        System.out.println(Sort(arr));
    }
     static List<Integer> Sort(int[] arr){
        ArrayList<Integer> Duplicate = new ArrayList<>();
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
                Duplicate.add(arr[j]);
            }
        }
        return Duplicate;
    }
}
