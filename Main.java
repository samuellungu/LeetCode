package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String [] args){
        for(int i=0;i<10;i++){
            String name = UUID.randomUUID().toString();
//            System.out.println(fizzBuzz(15));
            System.out.println(name);
        }
    }
        

    // public List<String> fizzBuzz(int n) {
    //     List<String> res = new ArrayList<>();
    //     for(int i=1;i<=n;i++){
    //         if(i%3==0 && i%5==0){
    //             res.add("FizzBuzz");
    //             continue;
    //         }
    //         else if(i%3==0){
    //             res.add("Fizz");
    //             continue;
    //         }
    //         else if(i%5==0){
    //             res.add("Buzz");
    //             continue;
    //         }           
            
    //         else{
    //             res.add(""+i);
    //             continue;
    //         }
                
    //     }
       

    //     return res;
    // }
            
}
