package patterns;

import java.util.Scanner;
public class star {
    public static void main(String[] args) {

        for(int line=1; line<=10; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");

            }
            System.out.println();
            
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("Reverse pattern");
        int n= sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int s=1; s<=n-i+1; s++){
                System.out.print("*");

            }
            System.out.println();
            

        }
        
        
    }
    
}
