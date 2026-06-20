class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int n: nums){
            hash.merge(n, 1, Integer::sum);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for(Map.Entry<Integer,Integer> e: hash.entrySet()){
            int val = e.getKey();
            int freq = e.getValue();
            if (bucket[freq] == null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(val);
        }
        int[] ans = new int[k];
        int i = 0;
        for(int f = bucket.length -1; f >= 1 && i < k; f--){
            if(bucket[f] == null) continue;
            for(int value: bucket[f]){
                ans[i++] = value;
                if (i == k) break;
            }
        }
        return ans;
    }
}
