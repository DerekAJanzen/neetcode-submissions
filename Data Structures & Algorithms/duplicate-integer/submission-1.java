class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int n: nums){
            if(!mySet.contains(n)){
                mySet.add(n);
            } else{
                return true;
            }
        }
        return false;
    }
}
