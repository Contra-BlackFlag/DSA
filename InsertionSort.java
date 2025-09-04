public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2,6,0};      
        Sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    // static void Sort(int[] arr){
    //     for (int i = 1; i < arr.length; i++) {
    //         for (int j = i - 1; j>=0; j--) {
    //             if (arr[i]<arr[j]) {
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //                 i = j;
    //             }
                
    //         }
    //     }
    // }

    static void Sort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i - 1;

        // shift elements greater than key to one position ahead
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

}
