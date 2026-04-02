package functions;
import java.util.*;

public class product {
    public static int multiply(int a, int b){
        
        return a*b;
    }

    public static int fact(int n){
        int f =1;
        for(int i=1; i<=n; i++){
            f*=i;
        }
        return f;                 //factorial of n
    }

    public static int binomial(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nr = fact(n-r);

        int bc= fact_n/(fact_r*fact_nr);

        return bc;
    }



    public static void main(String[] args) {
        System.out.println(multiply(5, 10));

        int facto= fact(5);
        System.out.println(facto);

        System.out.println("Binomial Coeficient is " + binomial(5,2) );
    }
    
}
