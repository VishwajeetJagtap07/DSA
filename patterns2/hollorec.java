package patterns2;

public class hollorec {
    public static void hollo_Rec(int rows, int cols){
        for(int i= 1; i<=rows; i++){

            for(int j=1; j<=cols; j++){

                if(i==1 || i == rows || j==1 || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        System.out.println("This is the hollow rectangle");
        hollo_Rec(6, 07);
    }
    
}
