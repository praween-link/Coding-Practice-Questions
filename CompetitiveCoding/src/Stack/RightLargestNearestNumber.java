package Stack;

import java.util.*;

public class RightLargestNearestNumber {
    public static void main(String [] args){
        int[] arr = {2,14,7,5,4,5,6,1,4,7,3,9,0};
        Vector<Integer> res = rightNearestLargest(arr);
        System.out.println(res);
    }
    static Vector<Integer> rightNearestLargest(int[] arr){
        Stack<Integer> stack = new Stack<Integer>();
        Vector<Integer> vector = new Vector<Integer>();
        // {2,4,7,5,4,5,6,1,4,7,3,9,0}
        for(int i=arr.length-1; i>=0; i--){
            if(stack.isEmpty()){
                vector.add(-1);
            }else{
                while (!stack.isEmpty()) {
                    if(arr[i]<stack.peek()){
                        vector.add(stack.peek());
                        break;
                    }else{
                        stack.pop();
                    }
                }
                if(stack.isEmpty()){
                    vector.add(-1);
                }
            }
            stack.push(arr[i]);
        }
        Vector<Integer> res = new Vector<Integer>();
        for (int i=vector.size()-1; i >= 0; i--){
            res.add(vector.get(i));
        }
        return res;
    }
}
