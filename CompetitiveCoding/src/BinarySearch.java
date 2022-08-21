public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{0, 4, 9, 12, 16}, 12));
    }
    static int binarySearch(int[] arr, int target){
        return search(arr, target, 0, arr.length);
    }
    static int search(int[] arr, int target, int left, int right){
        int mid = left+((right-left)/2);
        if(left == right) return -1;
        if(arr[mid] == target) return mid;
        if(arr[mid] < target) return search(arr, target, mid+1, right);
        else return search(arr, target, left, mid);
    }
}
