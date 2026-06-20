class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hash = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String s: strs){
           char[] chars = s.toCharArray();
           Arrays.sort(chars);
           String key = new String(chars);
           hash.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        for(List<String> vals: hash.values()){
            ans.add(vals);
        }
        return ans;
    }
}
