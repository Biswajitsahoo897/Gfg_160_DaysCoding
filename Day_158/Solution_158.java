package Day_158;
class Solution {
    public int findUnique(int[] arr) {
        int num=0;
        for(int x: arr){
            num^=x;
        }
        return num;
    }
}