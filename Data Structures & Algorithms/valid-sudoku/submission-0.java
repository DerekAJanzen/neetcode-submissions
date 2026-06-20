class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> square = new HashMap<>(); //(r/3)*3 + c/3


        for(int r = 0 ; r < 9; r++){
            for(int c = 0; c < 9; c++){
                char val = board[r][c];
                if(val == '.'){
                    continue;
                }
                if(rows.getOrDefault(r, new HashSet<>()).contains(val) ||
                   cols.getOrDefault(c, new HashSet<>()).contains(val) ||
                   square.getOrDefault((r/3) * 3 + c / 3, new HashSet<>()).contains(val)){
                    return false;
                }
                rows.computeIfAbsent(r, k -> new HashSet<>()).add(val);
                cols.computeIfAbsent(c, k -> new HashSet<>()).add(val);
                square.computeIfAbsent((r/3) * 3 + c / 3, k -> new HashSet<>()).add(val);
            }
        }
        return true;
    }
}
