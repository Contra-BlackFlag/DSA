public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 8, 18, 44, 55};
        int key = 18;
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                System.out.print("target : " + mid);
                found = true;
                break;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}
