package Day_153;
import java.util.*;
class Solution {
    public int findMinCycle(int V, int[][] edges) {
        @SuppressWarnings("unchecked")
        List<int[]> []A=new ArrayList[V];
        for(int i=0;i<V;i++){
            A[i]=new ArrayList<>();
        }
        for(int[]e:edges){
            int u=e[0],v=e[1],w=e[2];
            A[u].add(new int[]{v,w});
            A[v].add(new int[]{u,w});
            
        }
        int r=Integer.MAX_VALUE;
        for(int i=0;i<V;i++){
            int[] D=new int[V],P=new int[V];
            Arrays.fill(D,(int)1e9);
            Arrays.fill(P,-1);
            D[i]=0;
            PriorityQueue<int[]> Q=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
            Q.add(new int[]{0,i});
            while(!Q.isEmpty()){
                int[] t=Q.poll();
                int d=t[0];
                int u=t[1];
                for(int[]a:A[u]){
                    int v=a[0],w=a[1];
                    if(D[v]>d+w){
                        D[v]=d+w;
                        P[v]=u;
                        Q.add(new int[]{D[v],v});
                        
                    }else if(P[u]!=v && P[v]!=u){
                        r=Math.min(r,D[u]+D[v]+w);
                    }
                }
                
            }
        }
        return r==Integer.MAX_VALUE?-1:r;
    }
}