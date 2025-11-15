public class BinarySearch {

    public static void main(String[] args) {
        int arr2[] = {3};
        int arr[] = { 2, 4, 5, 8, 18, 44, 55 };
        int key = 18;
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                System.out.println("target index : " + mid);
                found = true;
                break;
            } else if (key > arr[mid]) {
                start = mid + 1;
            }
            else end = mid;
        } 
        
        if (!found) {
            System.out.println("Not found");
        }
    }
}
