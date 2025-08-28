public class PivotsDuplicate {
    public static void main(String[] args) {
        int []arr = {1,1,3};
        System.out.println(PivotWithDuplicates(arr));
        // System.out.println(rotatedsearch(arr,0));
        
        
    }
    static boolean rotatedsearch(int []arr, int target){
        int pivot = PivotWithDuplicates(arr);
        int ans;
         if(pivot == -1){
           ans = BinarySearch(0,arr.length - 1,arr,target);
           if(ans!=-1){
            return true;
           }
        }
        else if(arr[pivot] == target){
            return true;
        }
        else if(arr[0]>target){
            
            ans  = BinarySearch(pivot+1,arr.length - 1,arr,target);
            if(ans!=-1){
            return true;
           }
        }
        else {ans = BinarySearch(0,pivot,arr,target);
          if(ans!=-1){
            return true;
           }}
            return false;
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
    static int PivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 1) {
            return 0;
        }
        else {while (start<= end) {
            int mid = start + (end - start)/2;
            if (mid<end && arr[mid]>arr[mid+ 1]) {
                return mid;
            }
            else if (mid > start && arr[mid]<arr[mid - 1]) {
                System.out.println(mid);
                 return mid -1;
            }
            if (arr[start] == arr[end] && arr[end] == arr[mid]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    System.out.println(end);
                    return end - 1;
                }
                end --;
            }
            else if (arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            else end = mid - 1;
        }}
        return -1;
    }
}
