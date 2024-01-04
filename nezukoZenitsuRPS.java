import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] rockPaperScissor(int k, String nezuko, String zenitsu) {
		// Write your code here.
		int nezukoWon = 0;
		int zenitsuWon = 0;
		int ans[] = new int[2];
		int nL = nezuko.length();
		int zL = zenitsu.length();
		for(int i = 0; i < k; i++){
			int nextN = (nL + i) % nL;
			int nextZ = (zL + i) % zL;
			char cN = nezuko.charAt(nextN);
			char cZ = zenitsu.charAt(nextZ);
			if(cN == 'P' && cZ == 'S'){
				zenitsuWon++;
			}
			else if(cN == 'P' && cZ == 'R'){
				nezukoWon++;
			}
			else if(cN == 'S' && cZ == 'R'){
				zenitsuWon++;
			}
			else if(cN == 'S' && cZ == 'P'){
				nezukoWon++;
			}
			else if(cN == 'R' && cZ == 'P'){
				zenitsuWon++;
			}
			else if(cN == 'R' && cZ == 'S'){
				nezukoWon++;
			}
		}
		ans[0] = nezukoWon;
		ans[1] = zenitsuWon;
		return ans;
	}
}
