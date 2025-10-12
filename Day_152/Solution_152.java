package Day_152;
class Solution {
    public void floydWarshall(int[][] dist) {
        int n=dist.length,inf=10000000;
        int [][] d=dist;
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    // If path through 'k' is shorter than direct path then update
                    // dist[i][j]
                    if(d[i][k]<inf && d[k][j]<inf && d[i][j]>d[i][k]+d[k][j]){
                        d[i][j]=d[i][k]+d[k][j];
                    }
                }
            }
        }
        
    }
}