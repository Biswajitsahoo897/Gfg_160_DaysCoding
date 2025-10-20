// User function Template for Java
class Trie {
    class N{
        N[] c=new N[26];
        boolean e;
    }
    N r=new N();
    // Insert a word into the Trie
    public void insert(String word) {
        N n=r;
        for(char ch:word.toCharArray()){
            n=n.c[ch-'a']!=null?n.c[ch-'a']:(n.c[ch-'a']=new N());
        }
        n.e=true;
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        N n=r;
        for(char ch :word.toCharArray()){
            if((n=n.c[ch-'a'])==null){
                return false;
            }
        }
        return n.e;
    }

    // Check if a prefix exists in the Trie
    public boolean isPrefix(String word) {
        N n=r;
        for(char ch :word.toCharArray()){
            if((n=n.c[ch-'a'])==null){
                return false;
            }
        }
        return true;
    }
}