//array containing atleast one duplicate numner then return true else return false


package Array.Assignment1;

import java.util.*;

public class que1 {
    public static boolean duplicate(int nums[]){

        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }                                     //time complexity = On2
        //     }
        // }
        // return false;

        int n = nums.length;

        Arrays.sort(nums);

        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    //time complexity = Onlogn + On

    public static void main(String[] args) {
        int nums[] = {1,12,3,1,4,5,6,7};

        System.out.println(duplicate(nums));
    }
    
    
}
