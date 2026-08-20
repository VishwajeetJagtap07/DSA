package practice.arrays;
import java.util.*;

public class pairs {

    public static void paris(int marks[]){
        for(int i=0; i<marks.length; i++){
            int curr = marks[i];
            for(int j=0; j<marks.length; j++){
                System.out.print("(" + curr+ "," + marks[j] + ")");
            }
            System.out.println();

        }
        
        
    }

    public static void main(String[] args) {
        int marks[] = {2,3,4,5,6,7};
        paris(marks);
    }
    
}
