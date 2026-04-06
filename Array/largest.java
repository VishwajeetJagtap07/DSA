package Array;

import java.util.*;

public class largest {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }

        for(int j=0; j<numbers.length; j++){
            if(smallest > numbers.length){
                smallest = numbers[j];
                
            }
            
        }
        System.out.println("The smallest number is : " + smallest);

        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,5,3,6,4};

        System.out.println("The largest number in array is " + getLargest(numbers));
    }
}
