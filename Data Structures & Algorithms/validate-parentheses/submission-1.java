class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else {
                // c is a closer: must match the opener on top, or it's invalid
                if(stack.isEmpty()) return false;
                char open = stack.pop();
                if(c == ')' && open != '(') return false;
                if(c == ']' && open != '[') return false;
                if(c == '}' && open != '{') return false;
            }
        }
        return stack.isEmpty();
    }
}
