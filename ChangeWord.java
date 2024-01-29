
import java.util.*;
import java.io.*;

public class ChangeWord {
    public static String convertString(String str) {
        // Write your code here
        String temp = "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                while (i < str.length() - 1 && str.charAt(i + 1) == ' ') {
                    i++;
                }
                result.append(changeFirst(temp)).append(" ");
                temp = "";
            }
            else{
                    temp += str.charAt(i);

            }

        }
        // Handle the last word if it's not followed by a space
        result.append(changeFirst(temp));
        return result.toString();
    }

    public static String changeFirst(String word) {
        if (word.isEmpty()) {
            return "";
        }
        String res = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (i == 0) {
                res += Character.toUpperCase(ch);
            } else {
                res += ch;
            }
        }
        return res;
    }
    public static void main(String args[]){
        String sentence = "i love programming and learning";
        String result = convertString(sentence);
        System.out.println(result);
    }
}
