package Day_117;
class Solution {
    int countWays(int n) {
        long a=1,b=1;
        while(n-- > 1){
            b+=a;
            a=b-a;
        }
        return (int)b;
    }
}