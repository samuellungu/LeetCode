package LeetCode;

public class Solution3 {
    
    public int lengthOfLongestSubstring(String s) {
        return 0; 
    }
    
    public static int generateSubstring(String str){
        int len = str.length();
        int output = 0;

        if(!str.isEmpty()) {
            output++;
        }

        for(int i=0; i < len; i++){
            for(int j=i+1; j < len; j++){
                String sub = str.substring(i, j);
                //System.out.println(sub);
                if(str.indexOf(sub)!=-1 && (str.charAt(i)!=str.charAt(j))){
                    output++;
                }
            }
        }
        return output;

    }

    public static void main(String [] args){
        System.out.println(generateSubstring("Hello"));
    }
    
}
