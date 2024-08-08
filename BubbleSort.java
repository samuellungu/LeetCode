package LeetCode;

public class BubbleSort {
    public int[] sort(int [] nums){

        boolean hasSwapped = true;
        
        while(hasSwapped){
            for(int i=1;i<nums.length-1;i++){
                if(nums[i-1]>nums[i]){
                    int temp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = temp;
                    hasSwapped = true;
                }
            }
            hasSwapped = false;

        }
        return nums;
    }
}
