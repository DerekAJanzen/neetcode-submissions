class Solution {
    public boolean isPalindrome(String s) {
        //new solution for O(1) space after looking at docs
        int l = 0;
        s = s.toLowerCase();
        int r = s.length()-1;
        while(l < r){
            while(l < r && !Character.isAlphabetic(s.charAt(r)) && !Character.isDigit(s.charAt(r))) r--;
            while(l < r && !Character.isAlphabetic(s.charAt(l)) && !Character.isDigit(s.charAt(l))) l++;
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
