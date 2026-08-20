package practice.arrays;

public class sub1 {

    public static void sub(int marks[]){

        int currsum= 0;

        for(int i=0; i<marks.length; i++){
            // int start = i;
            for(int j=i; j<marks.length; j++){
                // int end= j;
                currsum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print( marks[k]+ " ");
                    currsum += marks[k];
                    
                }
                System.out.print("Total sum is :"+ currsum);
                System.out.println();
            }
            
        }
        
    }

    public static void main(String[] args) {
        int marks[] = {2,4,6,8,10};
        sub(marks);
    }
    
}
