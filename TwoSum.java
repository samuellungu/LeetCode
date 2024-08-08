package LeetCode;

import java.util.List;
import java.util.ArrayList;;

public class TwoSum {
    public static List<Integer> result (int [] arr, int target){
        List<Integer> ans = new ArrayList<>();
        int low = 0;
        int high = arr.length-1;
        
        while(low < high){
            int sum = low + high;
            if(sum==target){
                ans.add(low);
                ans.add(high);
                if(low==low+1)low++;
                if(high==high-1)high--;

            }
            else if(sum < target){
                high--;
            }else{
                low++;
            }
        }
        return ans;
    }
}
