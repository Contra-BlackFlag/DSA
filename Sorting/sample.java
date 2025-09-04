package Sorting;

public class sample {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2,2,1,4,3,0};
        int max = 0;
        for (int j = 1; j < arr.length; j++) {
                if (arr[j]>arr[max]) {
                    max = j;
                }
            }
            System.out.println(max);
            // for (int i = 0; i < arr.length; i++) {
            //     if (max == arr[i]) {
            //         System.out.println(i);
            //         break;
            //     }
            // }
            // System.out.println(8-3-2);
    }
}
