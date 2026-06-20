class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> curSet = new HashSet<>();
        for(int n: nums){
            curSet.add(n);
        }
        int maxLen = 0;
        for(int n: nums){
            if(!curSet.contains(n - 1)){
                int len = 1;
                while(curSet.contains(n + len)){
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
