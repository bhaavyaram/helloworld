class Solution {
public:
    void dfs(int row, int col, vector<vector<int>>&grid, vector<vector<int>>&vis, int &area, int rdel[], int cdel[], int n, int m, int &cnt)
    {
        cnt++;
        vis[row][col]=1;
        for(int i=0;i<4;i++)
        {
            int nr = row+rdel[i];
            int nc = col+cdel[i];
            if(nr<n && nr>=0 && nc<m && nc>=0 && grid[nr][nc]==1 && vis[nr][nc]!=1)
            {
                dfs(nr,nc,grid,vis,area,rdel,cdel,n,m,cnt);
            }
        }

    }
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        int rdel[] = {-1,0,1,0};
        int cdel[] = {0,1,0,-1};
        int count=1;
        vector<vector<int>>vis(n,vector<int>(m,0));
        int area=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && vis[i][j]!=1)
                {
                    count=0;
                    dfs(i,j,grid,vis,area,rdel,cdel,n,m,count);
                    area = max(area,count);
                }
            }
        }
        return area;
    }
};
