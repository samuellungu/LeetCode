package LeetCode;

public class Solution14 {
    public static String longestCommonPrefix(String [] str){
        String longestPrefix = "";
        int shortestWord = shortestWord(str);

        if(shortestWord==0){
            return longestPrefix;
        }

        if(shortestWord==1){
            longestPrefix = str[0];
            return longestPrefix;
        }     
        
        for(int i=0;i < shortestWord;i++){
            if(str[0].charAt(i) == str[1].charAt(i) 
            && str[1].charAt(i) == str[2].charAt(i)){
                longestPrefix = longestPrefix+str[0].charAt(i);
                continue;
            }
            else break;
        }


        return longestPrefix;
    }

    private static int shortestWord(String [] str){
        int shortest = str[0].length();
        
        if(str.length==1){
            return 1;
        }

        if(str.length==0){
            return 0;
        }        
        for(int i=1; i<str.length;i++){
            if(shortest > str[i].length()){
                shortest = str[i].length();
            }
        }
        return shortest;
    }

    public static void main(String [] args){
        String arr [] = {"flower", "flow", "flight", "flight"};

        String response = longestCommonPrefix(arr);

        System.out.println(response);
    }
}
