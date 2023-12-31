import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        int ans = keepingScore(arr, n);
        System.out.println(ans);
    }

    public static int keepingScore(String arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String word : arr) {
            if (word.equals("+") && list.size() > 1) {
                int temp = list.get(list.size() - 1) + list.get(list.size() - 2);
                list.add(temp);
            } else if (word.equals("D") && list.size() > 0) {
                int temp = list.get(list.size() - 1) * 2;
                list.add(temp);
            } else if (word.equals("C") && list.size() > 0) {
                list.remove(list.size() - 1);
            } else {
                int num = Integer.parseInt(word);
                list.add(num);
            }
        }
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
