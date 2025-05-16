package Day_046;
import java.util.HashSet;
class Solution {
    public static int findUnion(int a[], int b[]) {
        HashSet<Integer> set =new HashSet<>();
        for(int num1:a) set.add(num1);
        for(int num2:b) set.add(num2);
        return set.size();
        
    }
}