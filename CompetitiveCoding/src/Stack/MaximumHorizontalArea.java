package Stack;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class MaximumHorizontalArea {
    public static void main(String[] args){
        int[] arr = {7,2,10,5,3,1,6,6,6,2,9,6,0,7,11,5,6};
        int ma = maxHorizontalArea(arr);
        System.out.println("Maximum Horizontal Area: "+ma);
    }
    static int maxHorizontalArea(int[] arr){
        Vector<int[]> lfRt = leftAndRightNearestSmallest(arr);
//        for (int a: lfRt.get(0)) System.out.print(a+" ");
//        System.out.println();
//        for (int a: lfRt.get(1)) System.out.print(a+" ");
        int[] left = lfRt.get(0);
        int[] right = lfRt.get(1);
        int maxArea = 0;
        for(int i=0; i<left.length; i++){
            int w = right[i]-left[i]-1;
            int h = arr[i];
            if(w*h > maxArea){
                maxArea = w*h;
            }
        }
        return maxArea;
    }
    static Vector<int[]> leftAndRightNearestSmallest(int[]arr){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int len = arr.length;
        int[]a1=new int[len];
        int[]a2=new int[len];
        //
        for(int i=0; i<len; i++){
            if(stack1.isEmpty()){
                a1[i]=-1;
            }else{
                while (!stack1.isEmpty()){
                    if(arr[i]>arr[stack1.peek()]){
                        a1[i]=stack1.peek();
                        break;
                    }else {
                        stack1.pop();
                    }
                }
                if(stack1.isEmpty()){
                    a1[i]=-1;
                }
            }
            if(stack2.isEmpty()){
                a2[len-i-1]= len;
            }else{
                while (!stack2.isEmpty()){
                    if(arr[len-i-1]>arr[stack2.peek()]){
                        a2[len-i-1]=stack2.peek();
                        break;
                    }else {
                        stack2.pop();
                    }
                }
                if(stack2.isEmpty()){
                    a2[len-i-1]=len;
                }
            }
            stack1.push(i);
            stack2.push(len-i-1);
        }
        Vector<int[]> lfRt = new Vector<>();
        lfRt.add(a1);
        lfRt.add(a2);
        return lfRt;
    }
}
