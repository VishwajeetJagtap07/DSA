

public class reverse {
    public static void main(String[] args) {
        
        int n = 10899;
        //int rev =0;
        
        while(n>0){
            int LastDigit= n%10;
            System.out.print(LastDigit);
            //rev = (rev*10) + LastDigit;
            n= n/10;

        }
        System.out.println(" This is the reverse order of the number");
        //System.out.println(LastDigt);
    }
    
}
