import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static int minimumDistance(int arr[], int n, int x, int y) {
		// Write your code here.
		int minDiff = Integer.MAX_VALUE;
		int xDiff = -1;
		int yDiff = -1;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == x){
				xDiff = i;
			}
			if(arr[i] == y){
				yDiff = i;
			}
			if(xDiff >= 0&& yDiff >= 0){
				minDiff = Math.min(minDiff,(Math.abs(xDiff - yDiff)));
			}
		}
		if(minDiff == Integer.MAX_VALUE){
			return -1;
		}
		else{
			return minDiff;
		}
	}

}
