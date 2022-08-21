package Array;

import java.util.HashMap;
import java.util.Map;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int target = 0;
        int[] res = threeSum(arr, target);
    }
    static int[] threeSum(int[] arr, int target){

        return new int[]{};
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
