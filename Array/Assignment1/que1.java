//array containing atleast one duplicate numner then return true else return false


package Array.Assignment1;

import java.util.*;

public class que1 {
    public static boolean duplicate(int nums[]){

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,12,3,1,4,5,6,7};

        System.out.println(duplicate(nums));
    }
    
    
}
