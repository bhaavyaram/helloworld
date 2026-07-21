class Solution {

    public boolean traverse(char[][]board, int startrow, int endrow, int startcol, int endcol)
    {
        Set<Character>set = new HashSet<>();
        for(int i=startrow; i<=endrow; i++)
        {
            for(int j=startcol; j<=endcol; j++)
            {
                if(board[i][j] == '.')continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        Set<Character>setrow = new HashSet<>();
        //row check.
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                if(board[i][j] == '.') continue;
                if(setrow.contains(board[i][j])) return false;
                setrow.add(board[i][j]);
            }
            setrow.clear();
        }
        //column check
         Set<Character>setcol = new HashSet<>();
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                if(board[j][i]=='.')continue;
                if(setcol.contains(board[j][i])) return false;
                setcol.add(board[j][i]);
            }
            setcol.clear();
        }

        for(int startrow = 0; startrow <9; startrow+= 3)
        {
            int endrow = startrow+2;

            for(int startcol =0; startcol <9; startcol+= 3)
            {
                int endcol = startcol+2;

                if (!traverse(board,startrow,endrow,startcol,endcol))return false;
            }
        }
        return true;
        
    }
}