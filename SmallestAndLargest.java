public class SmallestAndLargest {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
       int key = 9;
    }

     public static int[] binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
         int ans[] = {0,0};
           int mid = 0;
        while (left <= right) {
             mid = left + (right - left) / 2;

            if (arr[mid] == target){
                 ans[0] = mid - 1;
                 ans[1] = mid + 1;
                 return ans;
            }
               
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        ans[0] = right;
        ans[1] = left;
        return ans;
    }
}
