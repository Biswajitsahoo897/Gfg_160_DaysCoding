package Day_079;

class Solution {
    public boolean isWordExist(char[][] mat, String word) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==word.charAt(0) && dfs(mat,word,i,j,0))
                return true;
                
            }
        }
        return false;
    }
    
    private boolean dfs(char[][]mat,String word,int i,int j,int k){
        if(k==word.length()) return true;
        if(i<0 || j<0 || i>=mat.length ||j>=mat[0].length || mat[i][j]!=word.charAt(k)) return false;
        char t=mat[i][j];
        mat[i][j]='#';
        boolean f=dfs(mat,word,i-1,j,k+1) || dfs(mat,word,i+1,j,k+1)||
        dfs(mat,word,i,j-1,k+1)||dfs(mat,word,i,j+1,k+1);
        mat[i][j]=t;
        return f;
    }
}