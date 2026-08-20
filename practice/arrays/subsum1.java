package practice.arrays;

public class subsum1 {
    public static void subsum(int marks[]){
        int currsum=0;
        int Max = Integer.MIN_VALUE;

        for(int i=0; i<marks.length; i++){
            for(int j=i; j<marks.length; j++){
                currsum=0;
                for (int k=i; k<=j; k++){
                    currsum += marks[k];
                    

                }
                System.out.println(currsum);

                if(Max < currsum){
                        Max = currsum;
                }
            }
            
        }
        System.out.println("Max sum is : " + Max);
    }

    public static void main(String[] args) {
        int marks[] = {1,-2,6,-1,3};
        subsum(marks);
    }
    
}
//this is brute force method it has the time complexity of O(n^3)