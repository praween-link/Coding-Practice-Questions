package Array;

public class MajorityElement {
    public static void main(String[] args) {

    }
    static int majorityElement(int [] nums){
        int [] temp = {};
        for(int num : nums){
            if(!checkElement(temp, num)){
                temp.add
            }
        }
    }
    // check element in array or not
    static boolean checkElement(int [] nums, int target){
        for(int num : nums){
            if(num == target){
                return true;
            }
        }
        return false;
    }
}
