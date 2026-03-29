class Solution {
public:
    void dfs(int i, int j, vector<vector<char>>&grid, vector<vector<int>>&vis, int rdel[], int cdel[])
    {
        int n = grid.size();
        int m = grid[0].size();
        vis[i][j]= 1;
        for(int k=0;k<4;k++)
        {
            int nr = i+rdel[k];
            int nc = j+cdel[k];
            if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]=='1' && vis[nr][nc]!=1)
            {
                dfs(nr,nc,grid,vis,rdel,cdel);
            }
        }

    }
    int numIslands(vector<vector<char>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        vector<vector<int>>vis(n,vector<int>(m,0));
        int rdel[] = {-1,0,1,0};
        int cdel[] = {0,1,0,-1};
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]!=1)
                {
                    count++;
                    dfs(i,j,grid,vis,rdel,cdel);
                }
            }
        }
        return count;

    }
};
