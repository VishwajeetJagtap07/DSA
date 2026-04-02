package functions;

import java.util.*;



    public class isprime {
//     public static boolean isPrime(int n){
//         if (n==2) {
//             return true;
//         }
//         boolean isPrime= true;
//         for(int i =2; i<=n-1; i++){
//             if(n % i ==0){
//                 isPrime =false;
//                 break;
//             }
//         }
//         return isPrime;
//     } 

    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n% i ==0){
                return false;

            }   
        }
        return true;

        
    }
    public static void Range(int n){
        for (int i =2; i<=n; i++){
             if(isPrime(i)){
                System.out.print(i + " ");
             }
        }

    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
        Range(50);
    }
    
}
