package forLoops;
import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==2){
            System.out.println(n + " is a prime");
            
        }else{
                boolean isPrime = true;
                for(int i=2; i<=Math.sqrt(n); i++){  // as using n-1 it is difficult for large number
                    if(n % i == 0){
                        isPrime= false;                    }
                }
                if(isPrime ==true){
                System.out.println(n + " is the prime number ");
                }else{
                    System.out.println(n + " is not a prime number");

                }
            }
            
        
    }
    
}
