//maximun profit

package Array.Assignment1;

public class que3 {
    public static int Maxprofit(int nums[]){

        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(buyprice < nums[i]){
                int profit = nums[i] - buyprice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyprice = nums[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int nums[] =  {7,2,5,1,9,3};
        System.out.println(Maxprofit(nums));
    }
    
}
