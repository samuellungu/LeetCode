package LeetCode;

public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximumOnes = Integer.MIN_VALUE;
        int countOnes = 1;
        for(int i=0; i< nums.length;i++){
            if(nums[i]==1){
                countOnes++;
            }
            else{
                maximumOnes = countOnes;
                //countOnes = 1;
                }
            }
            if(countOnes > maximumOnes){
                maximumOnes = countOnes;                    
            }
        
        return maximumOnes;
    }
}
