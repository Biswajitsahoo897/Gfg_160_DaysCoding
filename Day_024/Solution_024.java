package Day_024;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        List<int[]> merged=new ArrayList<>();
        if(arr.length==0) return merged;
        
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        
        int []current=arr[0];
        merged.add(current);
        
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=current[1]){
                current[1]=Math.max(current[1],arr[i][1]);
                
            }else{
                current=arr[i];
                merged.add(current);
            }
        }
        return merged;
    }
}