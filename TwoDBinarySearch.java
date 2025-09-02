import java.util.Arrays;

public class TwoDBinarySearch {
    public static void main(String args[]){
        int[][] arr = {{-1,3}};
        System.out.println(Arrays.toString(search(arr, 3)));
        System.out.println(arr[0].length);
       
    }
    static int[] search(int[][] arr,int target){
        int row = 0;
        int column = arr[0].length - 1;
        while (row < arr.length && column>=0 ) {
            if (arr[row][column] == target) {
                return new int[]{row,column};
            }
            else if (arr[row][column]<target) {
                row++;
            }
            else column--;
        }
        return new int[]{-1,-1};
    }
}
