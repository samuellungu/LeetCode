package LeetCode;

public class Solution26 {
    public static int [] removeDuplicates2(int[] nums) {
        int j=0;       
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=nums[j]){                             
                nums[++j] = nums[i];                 
            }           
                                
        }
        return nums;     
        
    }

    public static int [] removeDuplicates(int[] nums) {
        int j=0;       
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=nums[j]){                             
                nums[j++] = nums[i];                 
            }           
                                
        }
        return nums;     
        
    }
    public static void main(String [] args){
        //int val = 3, nums [] = {3,2,2,3}; 
        int nums [] = {1,1,2};        
        int [] arr = removeDuplicates2(nums);
        for(int a: arr){
            System.out.println(a);
        }
    }
}
