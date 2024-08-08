package LeetCode;

public class Solution1299 {
    public int[] replaceElements(int[] arr) {
        
        int len=arr.length;         
        for(int i=0;i<len;i++){
            if((len-1)==i){
                arr[i]=-1;
                
            }else{
                int max = arr[i+1];
                for(int j=i+2;j<len;j++){
                    if(arr[j]>max){
                        max = arr[j];
                    }
                }                  
                arr[i]=max;
            }  
            
           
                
        }
        return arr;
        
    }
}
