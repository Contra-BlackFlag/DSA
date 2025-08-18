public class FindInRotatedArray {
    public static void main(String[] args) {
        int target = 0;
        int arr[]= {1};
        int pivot = PivotWithDuplicates(arr);
        if(pivot == -1){
           System.out.println(BinarySearch(0,arr.length - 1,arr,target));
        }
        else if(arr[pivot] == target){
            System.out.println(pivot);
        }
        else if(arr[0]>target){
            
            System.out.println(BinarySearch(pivot+1,arr.length - 1,arr,target));
        }
        else System.out.println(BinarySearch(0,pivot,arr,target));

        
    }
    static int BinarySearch(int start,int end,int[] arr,int key){
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

    static int Pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start<= end) {
            int mid = start + (end - start)/2;
            if (mid<end && arr[mid]>arr[mid + 1]) {
                return mid;
            }
            else if (mid > start && arr[mid]<arr[mid - 1]) {
                 return mid -1;
            }
            else if (arr[mid]<=arr[start]){
                end = mid -1;
            }
            else start = mid + 1;
        }
        return -1;
    }

    static int PivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start<= end) {
            int mid = start + (end - start)/2;
            if (mid<end && arr[mid]>arr[mid + 1]) {
                return mid;
            }
            else if (mid > start && arr[mid]<arr[mid - 1]) {
                 return mid -1;
            }
            if (arr[start] == arr[end] && arr[end] == arr[mid]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end --;
            }
            else if (arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return -1;
    }
}
