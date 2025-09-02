package Day_133;
import java.util.*;
class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length,a=0,d=0,cnt=0,ans=0;
        // a->keeps track of arrival time and d->departure time , n->is the number of trains
        while(a<n && d<n){
            if(arr[a]<=dep[d]){
                cnt++;
                ans=Math.max(ans,cnt);
                // update the ans
                a++;
            }
            else{
                cnt--;
                d++;
            }
        }
        return ans;
    }
}
