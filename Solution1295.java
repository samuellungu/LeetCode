package LeetCode;

public class Solution1295 {
    public int findNumbers(int[] nums) {
        int evenDigits = 0;
        for(int i=0;i<nums.length;i++){
            int digits = 0;
            while(nums[i]!=0){
                nums[i] /= 10;
                digits++;
            }
            if(digits%2==0){
                evenDigits++;
            }

        }
        return evenDigits;
    }
}
