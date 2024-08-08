package LeetCode;

public class Solution1342Bitwise {
    public int numberOfSteps(int num) {
        int steps= 0;
        while(num!=0){
            if((num & 0)==0){
                num>>=1;                
            }else{
                num--;                
            }
            steps++;
        }
        return steps;
    }
}
