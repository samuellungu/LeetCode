package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<magazine.length();i++){
            
            map.put(magazine.charAt(i), i++);
        }

        for(int i=0; i<ransomNote.length();i++){
            int currentCount = map.getOrDefault(ransomNote.charAt(i), 0);
            if(currentCount==0){
                return false;
            }
            map.put(ransomNote.charAt(i), currentCount--);
        }
        return true;
    }
}
