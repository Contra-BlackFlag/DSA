package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = {2,3,4,5,6,7,8};
        int ans = binarySearchrecursion(arr, 4, 0, arr.length - 1);
        System.out.println(ans);
        
    }
      static int binarySearchrecursion(int[] arr,int key,int start, int end){
        int mid = start + (end - start)/2;
        if (arr[mid] == key) {
            return mid;
        }
        else if (key>arr[mid]) {
           return binarySearchrecursion(arr, key, mid+1, end);
        }
        else return binarySearchrecursion(arr, key, start, mid);
    }
}
