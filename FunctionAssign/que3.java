package FunctionAssign;

import java.util.*;

public class que3 {

    public static boolean palindrome(int num){
        int pal = num;
        int reverse = 0;

        while(pal !=0){
            int remainder = pal % 10;
            reverse = reverse * 10 + remainder;
            pal = pal /10;
        }
        if (num == reverse){
            return true;
        }else{
            return false;
        }

        

        }
        public static void main(String[] args) {
            System.out.println("Entet the number");
            Scanner sc = new Scanner(System.in);

            int pal = sc.nextInt();

            if(palindrome(pal)){
                System.out.println("The number " + pal + " is a palindrome");
            }else{
                System.out.println("the numner "+ pal + " is not the palindrome");
            }



        }

    }

    
    

