public class SplitArrayLargestSum {
     public static void main(String[] args) {
        int[] arr = {2,4,3,4,6,1};
        int k = 2;
        System.out.println(LargestSum(arr, k));
    }

    static int LargestSum(int []arr,int k){
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end = end + arr[i];
            
        }

        while (start<end) {
            int sum = 0;
            int pieces = 1;
            int mid = start + (end - start)/2;
            for(int num : arr){
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                }
                else sum = sum + num;
            }
            if (pieces>k) {
                start = mid + 1;
            }
            else end = mid;
        }
        return end;
    }
}