package Sorting;

import java.util.Arrays;

public class FindtheDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};  
        System.out.println(Sort(arr));
    }
    static int Sort(int[] arr){
         int i = 0;
        while (i<arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i]<arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
                }
                else{
                    return arr[i];
                }
            }
            else i++;

        }
        // for (int j = 0; j < arr.length; j++) {
        //     if (arr[j] != j+1) {    // [1, 2, 3, 4, 3]
        //         return arr[j];
        //     }
        // }
        return -1;
    }
}
