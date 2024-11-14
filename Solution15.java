package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Solution15 {
    public static List<List<Integer>> threeSum(int[] nums) {        
        List<List<Integer>> result = new ArrayList<>();

        int left = 0;
        int right = nums.length-1;

        while(left < right){
            for(int i=0;i<nums.length-1;i++){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(nums[left]==nums[left+1])++left;
                    while(nums[right]==nums[right-1])--right;
                }

                else if(sum> 0){
                    --left;
                }
                else
                    right++;
            }
        }
        return result;
        
    }

    public static List<List<Integer>> threeSums(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip the same element to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;                    // Skip the same element to avoid duplicate triplets
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args){
        int [] nums = {0,0,0};//{-1,0,1,2,-1,-4};
        List<List<Integer>> solution = threeSum(nums);
        System.out.println(solution);
    }
}
