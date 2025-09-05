package Sorting;
import java.util.*;
public class DisappearedNoinArrayRange {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1}; // 1,2,3,4,2,3,7,8
        System.out.println(sort(arr));
    }
    static List<Integer> sort(int[] arr){
        ArrayList<Integer> Disappeared = new ArrayList<>();
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
                Disappeared.add(j);
            }
        }
       return Disappeared;
    }
}
