class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int newmat[][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                newmat[i][j] = matrix[i][j];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int k=0;k<row;k++)
                    {
                        newmat[k][j]=0;
                    }
                    for(int l=0; l<col;l++)
                    {
                        newmat[i][l]=0;
                    }
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j] = newmat[i][j];
            }
        }
        
    }
}
