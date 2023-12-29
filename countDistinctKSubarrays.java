import java.util.ArrayList;

public class Solution {
    public static int distinctSubKOdds(int []arr, int k) {
        // Write your code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = i;j < arr.length; j++){
                temp.add(arr[j]);
                if(validOdd(temp, k)){
                    list.add(temp);
                }
            }
        }
        return list.size();
    }
    public static boolean validOdd(ArrayList<Integer> arr,int k){
        int count = 0;
        for(int num: arr){
            if(num % 2 != 0){
                count++;
            }
        }
        return count == k;
    }
}
