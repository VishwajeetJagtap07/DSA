package practice.arrays;

import java.util.Scanner;

public class binary {

    public static int bin(int marks[], int key){

        int start = 0;
        int end = marks.length-1;

        while(start<= end){

            int mid = (start + end)/2;

            if(marks[mid]==key){
                return mid;
            }
            if(marks[mid] < key){
                start = mid+1;
            }
            if(marks[mid] > key){
                end = mid -1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int marks[] = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        System.out.println("The number is at index :" + bin(marks, key));
    }
    
}
