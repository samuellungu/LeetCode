package LeetCode;

public class Solution1480 {
    public int[] runningSum(int[] nums) {
       
        for(int i=0; i<nums.length;i++){
            if(i==0){
                nums[i] = nums[i];
            }else{
                nums[i] = nums[i-1] + nums[i];
            }
            
        }    
        return nums;
    }

    public static void main(String [] args){
        Solution1480 sol = new Solution1480();
        int [] nums = {1,2,3,4}; 
        int [] res= sol.runningSum(nums);
        for (int i : res) {
            System.out.println(i);
        }
        
    }
}
