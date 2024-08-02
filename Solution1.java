package LeetCode;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public int [] twoSum(int [] nums, int target){
        HashMap <Integer, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        int key;
        for(int i=0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            key = target - nums[i];
            if(map.containsKey(key) && map.get(key)!=i){
                arr.add(i);
                arr.add(map.get(key));
                break;
            }
        }

        int [] sol = new int[arr.size()];
        for(int i=0; i < arr.size(); i++){
            sol[i] = arr.get(i);
        }
        Arrays.sort(sol);

        return sol;

    }
    
    
}
