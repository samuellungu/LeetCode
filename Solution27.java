package LeetCode;

public class Solution27 {
    public static int[] removeElement(int[] nums, int val) {        
        int j=0;        
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[j];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }       
        return nums;
    }
    public static void main(String [] args){
        //int val = 3, nums [] = {3,2,2,3}; 
        int val = 2, nums [] = {0,1,2,2,3,0,4,2};        
        int [] arr = removeElement(nums,val);
        for(int a: arr){
            System.out.println(a);
        }
    }
}
