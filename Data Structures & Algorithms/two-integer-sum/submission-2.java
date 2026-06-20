class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash = new HashMap<>();
        int l = 0;
        int r = 0;
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(hash.containsKey(diff)){
                r = i;
                Integer diffKey = hash.get(diff);
                l = diffKey.intValue();
                break;
            }
                hash.put(nums[i],i);
        }
        return new int[] {l,r};
    }
}
