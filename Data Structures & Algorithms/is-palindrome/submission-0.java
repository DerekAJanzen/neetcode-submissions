class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        s = s.toLowerCase();
        int r = s.length()-1;
        char[] charArr = s.toCharArray();
        while(l < r){
            while(l < r && !Character.isAlphabetic(charArr[r]) && !Character.isDigit(charArr[r])) r--;
            while(l < r && !Character.isAlphabetic(charArr[l]) && !Character.isDigit(charArr[l])) l++;
            if(charArr[l] != charArr[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
