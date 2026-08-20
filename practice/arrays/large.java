package practice.arrays;

public class large {

    public static int large(int marks[]){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<marks.length; i++){
            if(largest < marks[i]){
                largest = marks[i];
            }
            if(smallest >marks[i]){
                smallest = marks[i];
            }
        }
        System.out.println("The smallest number is : " + smallest);


        return largest;
    }

    public static void main(String[] args) {
        int marks[] = {1,2,3,6,5,4};

        System.out.println(large(marks));
    }
    
}
