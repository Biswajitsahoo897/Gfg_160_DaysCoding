import java.util.Arrays;
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int pro=1,n=arr.length,zeroCount=0,idx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0) {
                zeroCount++;
                idx=i;
            }
            else pro*=arr[i];
        }
        int res[]=new int[n];
        Arrays.fill(res,0);
        // if no zeros are there
        if(zeroCount==0){
            for(int i=0;i<n;i++){
                res[i]=pro/arr[i];
            }
        }
        else if(zeroCount==1){
            res[idx]=pro;
        }
        return res;
    }
}