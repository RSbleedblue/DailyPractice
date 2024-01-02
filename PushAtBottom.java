import java.util.* ;

import java.io.*; 
public class Solution 
{
  public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x) 
  {
    // Write your code here
    int arr[] = new int[myStack.size()+1];
    arr[0] = x;
    int i = 1;
    while(!myStack.isEmpty()){
      arr[i] = myStack.pop();
      i++;
    }
    reverse(arr,1);
    for(int num: arr){
      myStack.add(num);
    }
    return myStack;

    
  }
  public static void reverse(int arr[],int si){
    int i = si;
    int j = arr.length-1;
    while(i < j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }
}
