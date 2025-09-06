package Sorting;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(Sort(arr));
    }
    static int Sort(int[] arr){
        int i = 0;
        while (i<arr.length) {
            int correct = i;
            if (arr[i]>arr.length || arr[i] <= 0) {
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
                return j+1;
            }
        }
        return arr.length + 1;
    }
}
