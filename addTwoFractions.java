import java.util.* ;
import java.io.*; 
public class Solution {

    public static long[] addFraction(int a, int b, int c, int d) {
        // Write your code here.
        int gcd = gcdFormula(b, d);
        int fact1 = gcd / b;
        int fact2 = gcd / d;
        int numerator = fact1 * a + fact2 * c;
        int denominator = gcd;
        int gcdCheck = lcm(numerator, denominator);
        if(gcdCheck != 1){
            denominator = denominator / gcdCheck;
            numerator = numerator / gcdCheck;
        }
        long[] ans = new long[2];
        ans[0] = numerator;
        ans[1] = denominator;
        return ans;

    }
    public static int gcdFormula(int a, int b){
       
       a = Math.abs(a);
        b = Math.abs(b);
        int num1 = a;
        int num2 = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = (num1 * num2) / a;
        return gcd;
    }
    public static int lcm(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);
       
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
