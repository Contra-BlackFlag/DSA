class MissingNumber{
   public static void main(String[] args) {
        int[] arr = {3,1,7,4,2,6,0};
        Sort(arr);
        System.out.println(Sort(arr));
    }
    static int Sort(int[] arr) {
        int i = 0;
        while (i<arr.length) {
            int correct = i;
            if (arr[i]>=arr.length) {
                arr[i] = arr[i];
            }
            else correct = arr[i];
            if (arr[i] != arr[correct]) {
                if (arr[i]>=arr.length) {
                   
                }
              else { int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;}
            }
            else i++;
        }
        for (int j = 0; j < arr.length; j++) {
                if (arr[j] != j) {
                    return j;
                }
        }
        if(arr[arr.length - 1]< arr.length){
            return arr.length;
        }
        return -1;
    }
}