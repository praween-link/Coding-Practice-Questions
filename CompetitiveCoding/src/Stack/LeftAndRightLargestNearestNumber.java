package Stack;

import java.util.*;

public class LeftAndRightLargestNearestNumber {
    public static void main(String[] args) {
        int[] arr = {5,6,9,0,4,1,3,7,2,6,0,0,8,5,3,1,0,2};

        var res = leftAndRightLNN(arr);
        for (int i=0; i<res.get(0).size(); i++){
            System.out.print(res.get(0).get(i)+"<"+arr[i]+">"+res.get(1).get(i)+", ");
        }
    }
    static Vector<Vector<Integer>> leftAndRightLNN(int []arr){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Vector<Integer> vector1 = new Vector<>();
        Vector<Integer> vector2 = new Vector<>();

        int len = arr.length;
        for (int i=0; i<len; i++){
            if(stack1.isEmpty()){
                vector1.add(-1);
            }else{
                while (!stack1.isEmpty()){
                    if(arr[i]<stack1.peek()){
                        vector1.add(stack1.peek());
                        break;
                    }else {
                        stack1.pop();
                    }
                }
                if(stack1.isEmpty()){
                    vector1.add(-1);
                }
            }
            if(stack2.isEmpty()){
                vector2.add(-1);
            }else {
                while (!stack2.isEmpty()){
                    if(arr[len-1-i]<stack2.peek()){
                        vector2.add(stack2.peek());
                        break;
                    }else {
                        stack2.pop();
                    }
                }
                if(stack2.isEmpty()){
                    vector2.add(-1);
                }
            }
            stack1.push(arr[i]);
            stack2.add(arr[len-1-i]);
        }
        Vector<Integer> v2 = new Vector<Integer>();
        for (int i=vector2.size()-1; i >= 0; i--) v2.add(vector2.get(i));

        Vector<Vector<Integer>> res = new Vector<>();
        res.add(vector1);
        res.add(v2);
        return res;
    }
}
