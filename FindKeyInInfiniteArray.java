public class FindKeyInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,12,14,15,18,20};
        int key = 15;
        boolean found = false;
        int left = 0;
        int right = 1;
        while (!found) {
            if (binarySearch(arr, key, left, right) == key) {
                found = true;
            }
            else{
                binarySearch(arr, key, left, right);
            }
        }
    }
    public static int binarySearch(int[] arr,int key,int left,int right){
        while (left<=right) {
            int mid = left + (right - left)/2;
            if (arr[mid] == key) {
                return mid;
            }
            else if(arr[mid]>key){
                right = mid -1;
            }
            else left = mid + 1;
        }
        return -1;
    }
}
