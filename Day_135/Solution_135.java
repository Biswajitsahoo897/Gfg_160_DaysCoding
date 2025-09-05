package Day_135;
import java.util.*;

class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n=deadline.length ,ctn =0,tot=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        List<int[]> jobs=new ArrayList<>();
        
        for(int i=0;i<n;i++) jobs.add(new int[] {deadline[i],profit[i]});
        jobs.sort(Comparator.comparingInt(a->a[0]));
        
        for(int [] job:jobs){
            if(job[0]>pq.size())pq.add(job[1]);
            else if(pq.peek()< job[1]){
                pq.poll();
                pq.add(job[1]);
            }
        }
        
        ctn=pq.size();
        while(!pq.isEmpty()) tot+=pq.poll();
        
        return new ArrayList<>(Arrays.asList(ctn,tot));
    }
}