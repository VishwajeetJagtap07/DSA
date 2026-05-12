//it is a example of the binary search

package Array.Assignment1;

public class que2 {
    public static int target(int nums[], int key){

        int start = 0;
        int end = nums.length-1;

        while( start <= end){

            int mid = (start + end)/2;

            if(nums[mid]== key){
                return mid;
            }
            if(nums[mid] < key){
                start= mid+1;
            }
            if(nums[mid] > key){
                end = end-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8};
        int key = 7;

        System.out.println(target(nums, key));
    }

    
}
