public class FindPeakInMountainArray {
    public static void main(String[] args) {
         int arr[] = {0,1,2,3,7,4};
         int start = 0;
         int end = arr.length -1;
         while (start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid]<arr[mid + 1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
         }
         System.out.println(start + " " + end);
    }
    
}
