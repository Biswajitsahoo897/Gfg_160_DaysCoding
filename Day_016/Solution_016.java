package Day_016;
class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
    if(s1.length()!=s2.length()) return false;
    int[] newarr =new int[26]; //creating an array for storing the letters 
    
    for(int i=0;i<s1.length();i++){
        newarr[s1.charAt(i)-'a']++;
        newarr[s2.charAt(i)-'a']--;
    }
    for(int arr:newarr){
        if(arr!=0)
        return false;
    }  
    return true;
    }
}