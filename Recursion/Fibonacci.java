package Recursion;
public class Fibonacci{
    public static void main(String[] args) {
        int ans = recursion(5);
        System.out.println(ans);
    }
    static int recursion(int num){
        if (num == 0 || num == 1) return num;
        
          return recursion(num - 1) + recursion(num - 2);

        
    }
  
}


