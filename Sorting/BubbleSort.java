package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2,6,0};
        Sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void Sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 1; j<arr.length - i;j++){
                if (arr[j]<arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
