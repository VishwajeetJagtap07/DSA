package loops;

import java.util.*;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the number ");
            int n = sc.nextInt();
            if(n % 10 ==0){
                System.out.println("The number is not valid, I am out ");
                break;// continue to skip any number
            
            }
            System.out.println("The number is " + n);

        }while(true);
    }
    
}
