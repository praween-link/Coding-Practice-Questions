package Stack;

import java.util.*;

public class LeftLargestNearestNumber {
    public static void main(String []args){
        int[] arr = {5,6,4,0,6,2,8,5,1,3,9,6,1};
        System.out.println(leftNLN(arr));
    }
    static Vector<Integer> leftNLN(int[] arr){
        Stack<Integer> stack = new Stack<Integer>();
        Vector<Integer> vector = new Vector<Integer>();

        for (int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                vector.add(-1);
            }else {
                while (!stack.isEmpty()){
                    if(arr[i] < stack.peek()){
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
        return vector;
    }
}
