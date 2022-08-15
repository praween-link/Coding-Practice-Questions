package Array;
/// LeetCode Array Problem ///
public class ContainerWithMostWater {
    public static void main(String [] args){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int res = containerWithMostWater(arr);
        System.out.println(res);
    }
    static int containerWithMostWater(int[] arr){
        int len = arr.length;
        int[] right = new int[len];
        int[] left = new int[len];
        for(int i=0; i<len; i++){
            for (int j=len-1; j>=i; j--){
                if(arr[i] <= arr[j]){
                   right[i]=j;
                   break;
                }
            }
            for (int j=0; j<=len-i-1; j++){
                if(arr[len-i-1] <= arr[j]){
                    left[len-i-1]=j;
                    break;
                }
            }
        }
//        for (int v:right) System.out.print(v+" ");
//        System.out.println();
//        for (int v:left) System.out.print(v+" ");
        int maxWater = 0;
        for(int i=0; i<len; i++){
            if(arr[i]*(right[i]-left[i])>maxWater){
                maxWater = arr[i]*(right[i]-left[i]);
            }
        }
        return maxWater;
    }
}
