public class FindKeyInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,12,14,15,18,20,21,22,23,24,25,26,27,28,29,33,34,36,37,38,39,40,41,42,55,56,58,59,60,61,66,67,68,69,70};
        int key = 33;
        int left = 0;
        int right = 1;
        while (key>arr[right]) {
           int temp = right + 1 ;
           right = right + (right - left + 1)*2;
           left = temp;
            
        }

        System.out.println(binarySearch(arr, key, left, right));
    }
    public static int binarySearch(int[] arr,int key,int start,int end){
       while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
