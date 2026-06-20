class Solution {
    private List<String> enc;
    private String dec;

    public String encode(List<String> strs) {
        this.enc = strs;
        return strs.toString();
    }

    public List<String> decode(String str) {
        return this.enc;
    }
}
