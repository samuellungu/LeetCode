package LeetCode;

public class BubbleSort {
    public int[] sort(int [] nums){
        boolean sorted = false;
        for(int i=1;i<nums.length;i++){
            while(!sorted){
                if(nums[i-1]>nums[i]){
                    int temp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = temp;
                    sorted = true;
                }
            }
            
        }

        return nums;
    }
    
}
