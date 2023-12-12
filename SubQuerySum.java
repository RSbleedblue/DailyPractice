/*
You have given a 2-dimensional array ‘ARR’ with ‘N’ rows and ‘M’ columns. The queries are given in a 2-dimensional array ‘Queries’ of size ‘K’, in which Queries[i] 
contains four integers denoting the left top and right bottom indices of the submatrix whose sum we need to find. Your task is to find the sum of the submatrix for each query given in the array ‘Queries’.

For example:

Consider ARR = [[1 , 2 , 3] , [3 , 4 , 1] , [2 , 1 , 2]] and Queries = [[0 , 0 , 1 , 2]], the submatrix with the left top index (0 , 0) and right bottom index (1 , 2) is  
                      [[1 , 2 , 3] , 
                       [3 , 4 , 1]]. 
The sum of the submatrix is 14. Hence, the answer is 14 in this case.
*/

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> findSubmatrixSum(ArrayList<ArrayList<Integer>> arr, ArrayList<ArrayList<Integer>> queries) {

		// Write your code here
		ArrayList<Integer> result = new ArrayList<>();
		int n = arr.size();
		int m = arr.get(0).size();
		for(ArrayList<Integer> list:queries){
			int SumofSub = 0;
			int left = list.get(0);
			int top = list.get(1);
			int right = list.get(2);
			int bottom = list.get(3);
			for(int i = left; i <= right ; i++){
				for(int j = top; j <= bottom; j++){
					SumofSub += arr.get(i).get(j);
				}
			}
			result.add(SumofSub);

		}
		return result;
	}
}
