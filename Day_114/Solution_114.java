package Day_114;
class Solution {
    static String longestPalindrome(String s) {
        int n=s.length() ,start=0,maxLen=0;
        for(int i=0;i<n;i++){
            for(int l:new int[]{i,i+1}){
                int left=i;
                int right=l;
                
                while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                    left--;
                    right++;
                }
                int currLen=right-left-1;
                if(currLen>maxLen){
                    start=left+1;
                    maxLen=currLen;
                }
            }
        }
        return s.substring(start,start+maxLen);
    }
}