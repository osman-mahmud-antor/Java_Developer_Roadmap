public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(nums[mid]>target){
                right = mid-1;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
