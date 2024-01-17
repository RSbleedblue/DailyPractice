import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> divideString(String word, int n) {
         int len = word.length();
        ArrayList<String> list = new ArrayList<>();

        if (len % n != 0) {
            return list;
        }

        int lenOfStr = len / n ;
        for (int i = 0; i < len; i += lenOfStr) {
            StringBuilder temp = new StringBuilder();
            temp.append(word.substring(i,i+lenOfStr));
            list.add(temp.toString());
        }

        return list;
    }
}
