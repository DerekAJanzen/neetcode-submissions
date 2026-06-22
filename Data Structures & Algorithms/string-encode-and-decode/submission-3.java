class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            int len = s.length();
            sb.append(len+"#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        int l = 0;
        List<String> ans = new ArrayList<>();
        while(l <= s.length()-1){
            int r = l;
            while(s.charAt(r) != '#'){
                r++;
            }
            int len = Integer.parseInt(s.substring(l,r));
            ans.add(s.substring(r+1, r+len+1));
            l = r + len + 1;
            r = l + 1;
        }
        return ans;
    }
}
