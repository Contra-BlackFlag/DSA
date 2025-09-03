public class FirstAndLastOccurence{
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,9,9,14,16,18};
       int key = 9;
       int ans[] = {-1,-1};
       ans[0] = binarySearch(arr, key,true);
       ans[1] = binarySearch(arr, key,false);
       System.out.println(ans[0]+" "+ans[1]);
    }

     public static int binarySearch(int[] arr, int target,boolean firstOccur) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        int mid = 0;
        while (left <= right) {
             mid = left + (right - left) / 2;

            if (arr[mid] == target){
                ans = mid;
                if (firstOccur) {
                    right = mid - 1;
                }
                else left = mid + 1;
                 
            }
               
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return ans;
    }
}
