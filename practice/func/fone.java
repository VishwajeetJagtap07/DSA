package practice.func;

import java.util.Scanner;

public class fone {

    public static int calc(int num1, int num2){
        int sum = num1 + num2;
       
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int add = calc(a, b);
        System.out.println("The sum is " + add);
    }
    
}
