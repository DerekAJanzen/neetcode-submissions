class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i] - 1)){
                int j = 0;
                int count = 1;
                while(set.contains(nums[i] + j)){
                    ans = Math.max(count, ans);
                    count++;
                    j++;
                }
            }
        }
        return ans;
    }
}
