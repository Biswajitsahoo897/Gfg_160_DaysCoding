package Day_039;
import java.util.Arrays;    
class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        for(int [] r:mat){
            if(Arrays.binarySearch(r,x)>=0){
                return true;
            }
        }
        return false;
    }
}
