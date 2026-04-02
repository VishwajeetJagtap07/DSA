package FunctionAssign;

import java.util.*;

public class que1 {
    public static int avg(){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();



        int average= a+b+c/3;

        return average;
    }

    public static void main(String[] args) {
        

        System.out.println(avg());
    }

    
}
