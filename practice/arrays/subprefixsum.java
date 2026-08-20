package practice.arrays;

public class subprefixsum {

    public static void prefix(int marks[]){
        int currsum = 0;
        int Max = Integer.MIN_VALUE;
        int prefix[] = new int[marks.length];

        prefix[0] = marks[0];

        for(int i=1; i<marks.length; i++){
            prefix[i] = prefix[i-1] + marks[i];
        }
        
        

        for (int i=0; i<marks.length; i++){
            int start =i;
            for(int j=i; j<marks.length; j++){
                int end =j;

                currsum = start ==0? prefix[end] : prefix[end] - prefix[start-1];

                if(currsum > Max){
                    Max = currsum;
                }
            }
            
            

        }
        System.out.println(Max);

    }

    public static void main(String[] args) {
        int marks[] = {2,4,6,8,10};
        prefix(marks);
    }

    
    
}
