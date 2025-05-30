class Solution {
    public int maxWater(int arr[]) {
        int l=0,r=arr.length-1,res=0,lMax=0,rMax=0;
        while(l<r){
            if(arr[l]<arr[r]){
                lMax=lMax>arr[l]?lMax:arr[l];
                res+=lMax-arr[l++];
            }else{
                rMax=rMax>arr[r]?rMax:arr[r];
                res+=rMax-arr[r];
                r--;
            }
        }
        return res;
    }
}
// it is a two pointer approach ofc to find the maximum water that can be trapped between the bars represented by the array
// had to wached a video to understand the logic