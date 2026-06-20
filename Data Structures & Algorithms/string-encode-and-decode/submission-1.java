class Solution {
    private List<String> enc;
    private String dec;

    public String encode(List<String> strs) {
        StringBuilder encStr = new StringBuilder();
        for(String s: strs){
            encStr.append(s.length()).append("#").append(s);
        }
        return encStr.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            ans.add(str.substring(j + 1, i));
        }
        return ans;
    }
}
