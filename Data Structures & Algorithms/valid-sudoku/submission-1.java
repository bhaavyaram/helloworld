class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                if(board[i][j] == '.') continue;
                if(set.contains("found"+board[i][j]+"at row"+i) ||
                set.contains("found"+board[i][j]+"at column"+j) ||
                set.contains("found"+board[i][j]+"at box row/3"+i/3+"col/3"+j/3)) return false;

                set.add("found"+board[i][j]+"at row"+i);
                set.add("found"+board[i][j]+"at column"+j);
                set.add("found"+board[i][j]+"at box row/3"+i/3+"col/3"+j/3);
            }
        }
        return true;
    }
}
