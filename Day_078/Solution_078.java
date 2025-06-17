package Day_078;
class Solution {
    
    static void solveSudoku(int[][] mat) {
        int []r=new int[9],c=new int[9],box=new int[9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(mat[i][j]!=0){
                    int m=1 << mat[i][j],idx=i/3*3+j/3;
                    r[i]|=m; 
                    c[j]|=m;
                    box[idx]|=m;
                }
            }
        }
        solve(mat,r,c,box,0,0);
    }
    static boolean solve(int mat[][],int r[],int c[], int box[],int i ,int j){
        if(i==9) return true;
        if(j==9) return solve(mat,r,c,box,i+1,0);
        if(mat[i][j]!=0) return solve(mat,r,c,box,i,j+1);
        for(int num=1,m;num<=9;num++){
            m=1<<num;
            int idx=i/3*3+j/3;
            if((r[i]&m)!=0 || (c[j]&m)!=0 ||(box[idx]&m)!=0) continue;
            mat[i][j]=num;
            r[i]|=m;
            c[j]|=m;
            box[idx]|=m;
            if(solve(mat,r,c,box,i,j+1)) return true;
            mat[i][j]=0;
            r[i]&=~m;
            c[j]&=~m;
            box[idx]&=~m;
        }
        return false;
    }
}