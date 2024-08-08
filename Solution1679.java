package LeetCode;

public class Solution1679 {
    public int maxOperations(int[] nums, int k) {
        int counter=0;
        int low = 0;
        int high = nums.length - 1;
        
        while(low < high){
            int sum = nums[low] + nums[high];
            if(sum==k){
                low++;
                high--;
                counter++;
            }else if(sum < k){
                low++;
            }
            else{
                high--;
            }
        }

        return counter;    
    }
    public static void main(String [] args){
        Solution1679 sol = new Solution1679();
        int [] nums = {1,2,3,4}; 
        System.out.println(sol.maxOperations(nums, 5));
    }
}
