package LeetCode;

public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int maximumAmount  = Integer.MIN_VALUE;
       
        for(int i=0;i<accounts.length; i++){
            int amount=0;
            for(int j=0;j < accounts[i].length; j++){
                amount = amount + accounts[i][j];                                
            }
            if(amount > maximumAmount){
                maximumAmount = amount;
            }
            
        }
        return maximumAmount;
    }
}
