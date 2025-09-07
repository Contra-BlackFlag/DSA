
public class ValidPalindrome {
    public static void main(String[] args) {
        String a = "race a car";
        System.out.println(Palin(a));;
    }
    static void isPalindrome(String a) {
        String regex = "[^a-zA-Z0-9\\s]";
       a = a.replaceAll(regex,"").replaceAll(" ", "").toLowerCase();
       String c = "";
       for (int i = a.length() - 1; i >= 0; i--) {
         c+= a.charAt(i);
       }
       System.out.println(a);
       System.out.println(c);
    }
    static boolean P(String a){
         a = a.replaceAll("[^a-zA-Z0-9\\s]","").replaceAll(" ", "").toLowerCase();
       for (int i = 0; i <= a.length()/2; i++) {
        char start  = a.charAt(i);
        char end =  a.charAt(a.length() - 1 -i);
        if(start != end){
            return false;
        }
       }
       return true;
    }
    static void Pal(String a){
        a = a.replaceAll("[^a-zA-Z0-9\\s]","").replaceAll(" ", "").toLowerCase();
        System.out.println(a);
       for (int i = 0; i <= a.length()/2; i++) {
        char start  = a.charAt(i);
        System.out.println(start);
        char end =  a.charAt(a.length() - 1 -i);
        System.out.println(end);
        if(start != end){
            System.out.println(false);;
        }
       }
       System.out.println(true);
    }
    static boolean Palin(String a){
        // Keep only alphanumeric and make lowercase
        a = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0, right = a.length() - 1;
        while (left < right) {
            if (a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
   

    }
}
