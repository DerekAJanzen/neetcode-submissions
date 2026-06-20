class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for(int i = 0; i < sArr.length; i++){
            map.put(sArr[i], map.getOrDefault(sArr[i], 0) + 1 );
            map.put(tArr[i], map.getOrDefault(tArr[i], 0) - 1);
        }
        for(int i: map.values()){
            if(i != 0){
                return false;
            }
        }
        return true; 
    }
}
