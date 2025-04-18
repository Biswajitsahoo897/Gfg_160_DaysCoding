package Day_017;
class Solution_017 {
    static char nonRepeatingChar(String s) {
        int [] newarr =new int[26];
        for(int i=0;i<s.length();i++){
            newarr[s.charAt(i)-'a']++;
        }
        for(char i:s.toCharArray()){
            if(newarr[i-'a']==1)
            return i;
        }
        return '$';
     }
}