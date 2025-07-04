package Day_095;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        ArrayList<Integer> res=new ArrayList<>();

        Arrays.sort(arr);
        
        for(int i=arr.length-1;i>=arr.length-k;i--){
            res.add(arr[i]);
        }
        return res;
    }
}
