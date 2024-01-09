class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int si = 0;
        int ei = numbers.length-1;
        while(si < ei){
            if(numbers[si] + numbers[ei] < target){
                si++;
            }
            else if(numbers[si] + numbers[ei] > target){
                ei--;
            }
            else{
                int ans[] = new int[2];
                ans[0] = si+1;
                ans[1] = ei + 1;
                return ans;
            }
        }
        int ans[] = new int[2];
        return ans;
    }
}
