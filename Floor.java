public class Floor {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
       int key = 14;
       System.out.println("Index is " + binarySearch(arr, key));
    }
     public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
           int mid = 0;
        while (left <= right) {
             mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid - 1;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return right; // Not found
    }
}
