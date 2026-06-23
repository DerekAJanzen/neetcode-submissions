class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int max = 1;
        int l = 0;
        int r = 1;
        HashSet<Character> set =  new HashSet<>();
        set.add(s.charAt(l));
        while(r < s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                max = Math.max(max, set.size());
                r++;
            } else{
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r));
                r++;
            }
        }
        return max; 
    }
}
