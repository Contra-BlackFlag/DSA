package Recursion;

public class Nto1 {
    public static void main(String[] args) {
      PrintNto1(5);
    }

    static void PrintNto1(int n){
            if (n == 0) {
                   return;
            }
            System.out.println(n);
           PrintNto1(n-1);
    }
}
