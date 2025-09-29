package Day_146;
import java.util.*;

class Solution {
    public int minCost(int[][] houses) {
        int n=houses.length,ans=0;
        //vis array to keep track of visited nodes
        boolean[] vis=new boolean[n];

        // array to keep track of the minimum distance to each node
        int[] d=new int[n];
        // initialize the distance array with maximum values
        Arrays.fill(d,Integer.MAX_VALUE);
        d[0]=0;
        for(int i=0;i<n;i++){
            //pick the minimum
            int m=Integer.MAX_VALUE,u=-1;
            //find the unvisited node with the smallest distance
            for(int j=0;j<n;j++){
                //if not visited and distance is less than current minimum
                if(!vis[j] && d[j]<m){
                    m=d[j];
                    u=j;
                }
            }
            vis[u]=true;
            ans+=m;//add the distance to the answer
            //update the distances of the unvisited nodes
            for(int j=0;j<n;j++){
                //if not visited
                if(!vis[j]){
                    //update the distance if it is less than the current one
                    d[j]=Math.min(d[j],Math.abs(houses[u][0]-houses[j][0])+Math.abs(houses[u][1]-houses[j][1]));

                }
            }
        }
        return ans;

    }
}
                    