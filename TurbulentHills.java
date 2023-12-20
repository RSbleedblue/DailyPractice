import java.util.* ;
import java.io.*; 
public class Solution {

	public static int longestDangerousRange(ArrayList<Integer> height, int n) {
		// Write your code here
		ArrayList<Character> list = new ArrayList<>();
		int equal = 0;
		for(int i = 0; i < n - 1; i++ ){
			if(height.get(i) < height.get(i+1)){
				list.add('<');
			}
			else if(height.get(i) > height.get(i+1)){
				list.add('>');
			}
			else{
				list.add('=');
				equal++;
			}
		}
		if(equal+1 == n){
			return 1;
		}
		int ans = 0;
		int count = 1;
		for(int i = 0; i < list.size()-1; i++){
			if((list.get(i) == '<' && list.get(i+1) =='>')|| (list.get(i) == '>' && list.get(i+1) =='<')){
				count++;
			}
			else{
				
				ans = Math.max(ans, count);
				count = 1;
			}
		}
		return Math.max(ans,count)+1;
	}
}
