package LeetCode;

public class Solution88 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int len = nums1.length-1;//5
        int index1 = m-1;//index1==2
        int index2 = n-1;//index2==2
        
        while(index1>=0 && index2>=0){
            if((nums2[index2] > nums1[index1])){
                nums1[len] = nums2[index2];
                index2--;                   
            }
            else{
                nums1[len] = nums1[index1];
                index1--; 
            }            
            len--;
        }

        while (index2 >= 0) {
            nums1[len] = nums2[index2];
            index2--;
            len--;
        }
        
        return nums1;  
        
        
        
    }
    public static void main(String [] args){
        
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int m = 3,  n = 3;
        //System.out.println("Heelo");
        int [] arr = merge(nums1, m, nums2, n);
        for(int a: arr){
            System.out.println(a);
        }
    }
}
