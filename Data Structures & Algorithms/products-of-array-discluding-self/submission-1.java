class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int total = 1;
        for(int i = 0; i < nums.length; i++){
            prefix[i] = total;
            total = total * nums[i];
            
        }
        int postTotal = 1;
        for(int j = nums.length-1; j >= 0; j--){
            postfix[j] = postTotal;
            postTotal = postTotal * nums[j];
        }
        int[] ans = new int[nums.length];
        for(int k = 0; k < nums.length; k++){
            ans[k] = prefix[k] * postfix[k];
        }
        return ans;
    }
}  
