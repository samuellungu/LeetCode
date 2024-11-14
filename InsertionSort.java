package LeetCode;

public class InsertionSort {
    public int [] insertSort(int [] nums){
        int n = nums.length;


        for(int i=1;i<n-1;i++){
            
            while(i>0 && (nums[i-1]>nums[i])){
                int temp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = temp;
                --i;                
            }
        }
        return nums;
    }
}
