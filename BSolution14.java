package LeetCode;

public class BSolution14 {
    public static String longestCommonPrefix(String [] strs){
        //String prefix = "";
      if(strs.length==0)return "";
      String prefix = strs[0];
      for(int i=0;i<strs.length;i++){
        if(strs[i].indexOf(prefix)!=0){
            prefix = prefix.substring(0, prefix.length()-1);
        }
      }
      return prefix;
    }
    public static void main(String [] args){
        String arr [] = {"flower", "flow", "florence", "flight", "flop"};
        String response = longestCommonPrefix(arr);
        System.out.println(response);
    }

}
