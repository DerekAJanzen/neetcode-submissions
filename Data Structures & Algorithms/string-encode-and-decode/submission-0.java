class Solution {
    public String encode(List<String> strs) {
            StringBuilder sb = new StringBuilder();
            for(String s: strs){
                int len = s.length();
                sb.append(len);
                sb.append('#');
                sb.append(s);
            }
            String enc = sb.toString();
            return enc;
        }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            String s = str.substring(j+1, j+1+len);
            ans.add(s);
            i = j + 1 + len;
        }

        return ans;
    }
}
