public class SplitArrayLargestSum {
     public static void main(String[] args) {
        int[] arr = {2,4,3,4,6,1};
        int k = 6;
        System.out.println(LargestSum(arr, k));
    }

    static int LargestSum(int []arr,int k){
        int ans = 0;
        if (k<=1 || k == arr.length) {
            if (k==arr.length) {
                for(int i = 0;i<arr.length;i++){
                    if (arr[i]>=ans) {
                        ans = arr[i];
                    }
                }
                return ans;
            }
            else if(k<1){
                return -1;
            }
            else{
                for(int i = 0; i<arr.length; i++){
                    ans = ans + arr[i];
                }
                return ans;
            }
        }
        return -1;
    }
}