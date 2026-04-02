package functions;
import java.util.*;

public class syntax {
    public static int printhello(int a, int b){ // these are formal parameters
        

        
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        int sum = printhello(5,7);                 // these are arguments(actual parameters)
        System.out.println("the sum is "+ sum);
    }

    
}
