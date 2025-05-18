// package Day_048;
import java.util.*;
class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        Map<String, ArrayList<String>> umap=new HashMap<>();
        for(String a:arr){
            char[] c=a.toCharArray();
            Arrays.sort(c);
            String sorted_s=new String(c);
            umap.computeIfAbsent(sorted_s,_->new ArrayList<>()).add(a);
                        
        }
        ArrayList<ArrayList<String>> res=new ArrayList<>(umap.values());
        return res;
    }
}