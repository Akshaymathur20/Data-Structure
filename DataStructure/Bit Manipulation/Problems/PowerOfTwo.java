import java.util.Scanner;

// package Bit Manipulation.Problems;


//Question link ---> 231
// https://leetcode.com/problems/power-of-two/?envType=study-plan&id=algorithm-i

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(isPowerOfTwo(n));
        
    }

    
     static boolean isPowerOfTwo(int n) {
       
        if(n==1){
            return true;
        }
        if(n%2!=0 || n<=0){
              return false;
        }
        return isPowerOfTwo(n/2);
    }
}
