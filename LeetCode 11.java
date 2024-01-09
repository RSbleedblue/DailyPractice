class Solution {
    public int maxArea(int[] arr) {
        int maxAns = Integer.MIN_VALUE;
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int diff = Math.min(arr[i], arr[j]) * (j - i);
            maxAns = Math.max(diff,maxAns);
            if(arr[i] <= arr[j]){
                i++;
            }
            else if (arr[i] > arr[j]){
                j--;
            }
        }
        return maxAns;
    }
    public int findMin(int arr[],int si,int ei){
        int min = Integer.MAX_VALUE;
        for(int i = si; i <= ei; i++){
            min = Math.min(min,arr[i]);
        }
        return min;
    }
}
