class Solution {
private:
    int bfs(int i, int j, vector<vector<int>>&grid, vector<vector<int>>&vis, int&p)
    {
        vis[i][j]=1;
        int n=grid.size();
        int m = grid[0].size();
        queue<pair<int,int>>q;
        q.push({i,j});
        int rdel[] = {-1,0,1,0};
        int cdel[] = {0,1,0,-1};
        while(!q.empty())
        {
            int count = 0;
            int r = q.front().first;
            int c = q.front().second;
            q.pop();
            for(int i=0;i<4;i++)
            {
                int nr = r+rdel[i];
                int nc = c+cdel[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1)
                {
                    count++;
                    if(vis[nr][nc]!=1)
                    {
                        vis[nr][nc]=1;
                        q.push({nr,nc});
                    }
                }

            }
             p+=(4-count);
        }
        return p;
        
    }
public:
    int islandPerimeter(vector<vector<int>>& grid) {
        int n=grid.size();
        int m = grid[0].size();
        int p=0;
        vector<vector<int>>vis(n,vector<int>(m,-1));
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]  && vis[i][j]==-1)
                {
                    return bfs(i,j,grid,vis,p);
                }
            }
        }
        return p;
    }
};