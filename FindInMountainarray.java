public class FindInMountainarray {
    public static void main(String[] args) {

            int arr[] = {1,2,3,4,5,3,3,1};
            int target = 1;
            int end = FindPeak(arr);
            int start = end;
            int ans = binarySearch(arr, target, 0, end);
            int ans1;
            if (ans == -1) {
                ans1 = binarySearch(arr, target, start+1, arr.length-1);
                if (ans == -1 && ans1 == -1) {
                    System.out.println("Not found");
                }
                else System.out.println(ans1);
            }
            else System.out.println(ans);
            
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
        
        public static int FindPeak(int arr[]){
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
         return end;
        }


    }

