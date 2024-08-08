package LeetCode;

public class Solution283 {
    public void moveZeroes(int[] nums) {
        int writePointer = 0;
        for(int readPointer=0;readPointer<nums.length;readPointer++){
            if(nums[readPointer]!=0){
                nums[writePointer]=nums[readPointer];
                writePointer++;
            }            
        }
        for(;writePointer<nums.length;writePointer++){
            nums[writePointer]=0;
        }
    }
}
