package Array;

public class EvenNumbersOfDigitCount {
    public static void main(String[] args) {
        // Array of numbers
        int[] nums = {12,345,2,6,7896};
        // Count even number of digit and print
        int res = countEvenNumberOfDigits(nums);
        System.out.println(res);
    }
    static int countEvenNumberOfDigits(int[] nums){
        int count = 0;
        // Count length of digit and return count
        for(int num : nums){
            // Check is length of digit are even or not
            // if length of digit is even then increment the count + 1
            if(lengthOfDigit2(num)%2==0){
                count++;
            }
        }
        return count;
    }

    static int lengthOfDigit2(int num){
        // Get length of digit: Calculate log10 of num convert in integer and add +1 then return
        if(num==0){
            return 1;
        }
        return (int)(Math.log10(num) + 1);
    }

    static int lengthOfDigit(int num){
        // Get length of digit: First convert integer to string and return length of string
        return Integer.toString(num).length();
    }
}
