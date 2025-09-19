package Day_142;
class Solution {
    public int countIslands(char[][] grid) {
        int n=grid.length,m=grid[0].length,ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='L'){
                    ans++;
                    dfs(grid,i,j,n,m);
                }
            }
        }
        return ans;
    }
    void dfs(char [][]g,int i,int j,int n,int m){
        if(i<0||j<0||i>=n||j>=m||g[i][j]=='W') return;
        g[i][j]='W';
        for(int a=-1;a<=1;a++){
            for(int b=-1;b<=1;b++){
                dfs(g,i+a,j+b,n,m);
            }
        }
    }
}