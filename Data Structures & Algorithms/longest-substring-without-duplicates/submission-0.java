class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();

        int l = 0;
        int r = 0;
        int max = 0;

        while(r < s.length()){
            while(chars.contains(s.charAt(r))){
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(r));
            max = Math.max(max, chars.size());
            r++;
        }
        return max;
    }
}
