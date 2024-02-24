class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }   
            else if(!st.isEmpty() && st.peek() != ch){
                st.push(ch);
            }
        }
        String ans = "";
        while(!st.isEmpty()){
            ans += st.pop();
        }
        ans = reverse(ans);
        return ans;

    }
    private String reverse(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
