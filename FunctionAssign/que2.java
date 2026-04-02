package FunctionAssign;

import java.util.*;

public class que2 {

    public static boolean isEven(int num){
        if(num % 2 ==0){

            return true;
        }else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        

        if( isEven(a)){
            System.out.println("The number" + a + " is Even");

        }else{
            System.out.println("The number" + a + " is not Even");
        }
    }
    
}
