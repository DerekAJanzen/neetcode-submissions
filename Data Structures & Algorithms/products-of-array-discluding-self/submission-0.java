class Solution {
    public int[] productExceptSelf(int[] nums) {
        //brute force with division
        int prod = 1; 
        int zeros = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeros++;
            } else {
                prod = nums[i] * prod;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(zeros == 0){
                ans[j] = prod / nums[j];
            } else if(zeros == 1){
                ans[j] = (nums[j] == 0) ? prod : 0;
            } else {
                ans[j] = 0;
            }
        }
        return ans;
    }
}  
