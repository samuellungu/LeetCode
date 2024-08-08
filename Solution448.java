package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Solution448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length-1;

        int largest = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }

        for(int i=1;i<=largest;i++){
            list.add(i);
        }

        for(int i=0;i< list.size();i++){
            if(list.contains(nums[i])){
                list.remove(nums[i]);
            }
        }

        return list;
    }

    public static void main(String [] ar){
        int [] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(nums);
        for(int an: ans){
            System.out.println(an);
        }
    }
}
