import java.util.* ;
import java.io.*; 
public class Solution {

    public static int beautifulIndex(int N, int[] A)
    {
        // Write your code here.
        int prefix[] = new int[N];
        int suffix[] = new int[N];

        prefix[0] = A[0];
        suffix[N-1] = A[N-1];
        //Prefix
        for(int i = 1; i < N; i++){
            prefix[i] = prefix[i-1] + A[i];
        }
        //Suffix
        for(int i = N-2; i >= 0; i--){
            suffix[i] = suffix[i + 1] + A[i];
        }
        for(int i = 0; i < N; i++){
            if(prefix[i] == suffix[i]){
                return i + 1;
            }
        }
        return -1;
    }
}
