package LeetCode;

public class Solution2678 {
    public static int countSeniors(String[] details) {
        int count=0;
        for(int i=0; i< details.length;i++){
            if(details[i].length() >=13){
                String ageString = details[i].substring(11, 13);
                try{
                    int age = Integer.parseInt(ageString);
                    if(age > 60){
                        count++;
                    }
                }catch(StringIndexOutOfBoundsException s){
                    
                }
            }
            
        }
        return count;
        
    }
    public static void main(String [] args){
        String details [] = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        //String detail = "5303914400F9211";
        //System.out.println(detail.substring(11, 13));
        System.out.println(countSeniors(details));
    }
}
