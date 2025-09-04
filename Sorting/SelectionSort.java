package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2,2,1,4,3,0};
        Sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void Sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j]>arr[max]) {
                    max = j;
                }
            }
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - i - 1] = arr[max];
            arr[max] = temp;
        }
    }
}
