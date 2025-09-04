package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2,6,0};
        Sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void Sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 1; j < arr.length - i; j++) {
                max = Math.max(arr[j],arr[j - 1]);
                
            }
            arr[arr.length - i] = max;
        }
    }
}
