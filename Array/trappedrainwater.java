package Array;

public class trappedrainwater {

    public static int trapped(int height[]){

        int n = height.length;
        //calculate the left max boundry
        int LMax[]= new int[n];
        LMax[0] = height[0];
        for (int i=1; i<n; i++){
            LMax[i] = Math.max(height[i], LMax[i-1] );
        }

        //calculate the right max
        int RMax[] = new int[n];
        RMax[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            RMax[i] = Math.max(height[i], RMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for (int i=0; i<n; i++){
            //waterlevel = min(max right boundry and left boundry)
            int waterLevel = Math.min(LMax[i], RMax[i]);
            // total trapped water
            trappedWater += (waterLevel-height[i]);
        }

        return trappedWater;


    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trapped(height));
    }
    
}
