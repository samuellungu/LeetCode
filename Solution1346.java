package LeetCode;

public class Solution1346 {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if((i!=j) && ((arr[i] == 2 * arr[j]))){
                    return true;
                }
            }
        }
        return false;
        
    }
    public static void main(String ars [] ){
        System.out.println(Integer.MIN_VALUE);
    }
}
