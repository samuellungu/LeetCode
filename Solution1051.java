package LeetCode;

import java.util.Arrays;

public class Solution1051 {
    public int heightChecker(int[] heights) {
        int [] expected = heights.clone();
        Arrays.sort(expected);
        int counter = 0;
        
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                counter++;
            }
        }
        return counter;
        
    }
}
