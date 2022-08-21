package Array;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {0,4,3,0};
        int target = 0;
        int[] res = twoSum(arr, target);
        System.out.print("[");
        boolean temp = false;
        for(int v:res){
            System.out.print(temp?(", "+v):v);
            temp = true;
        }
        System.out.println("]");
    }
    static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            int t = target-arr[i];
            if(map.containsKey(t)) return new int[]{map.get(t),i};
            map.put(arr[i], i);
        }
        return new int[]{};
    }
}
