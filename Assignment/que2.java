package Assignment;

import java.util.*;

public class que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do{
            System.out.println("Enter the number");
            number = sc.nextInt();
            if(number % 2 ==0){
                evensum += number;

            }else{
                oddsum += number;
            }
            System.out.println("Do you want to continue if yes press 1, if no press 0");

            choice = sc.nextInt();

        }while(choice==1);

        System.out.println("the sum of even number is " + evensum);
        System.out.println("The sum of odd numbers is " + oddsum);

    }
    
}
