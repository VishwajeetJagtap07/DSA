package practice.arrays;
import java.util.*;
public class reverse {

    public static void rev(int marks[]){

        int start =0;
        int end = marks.length-1;

        while(start < end){

            int temp = marks[end];
            marks[end] = marks[start];
            marks[start] = temp;

            start++;
            end--;

        }

    }
    
    public static void main(String[] args) {
        int marks[] = {1,2,3,4,5,6,7};

        rev(marks);
        System.out.println("The array is in reverse order");

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " , ");
        }
        System.out.println();
    }
}
