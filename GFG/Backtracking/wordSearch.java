class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        boolean v[][] = new boolean[mat.length][mat[0].length];
        for(int i = 0; i<mat.length;i++){
            for(int j = 0; j<mat[0].length;j++){
                if(mat[i][j] == word.charAt(0)){
                    if(check(mat, i, j, 0, word,v)){
                        return true;
                    }
                    
                }
            }
        }
        return false;
    }
    static boolean check(char[][] mat,int i,int j,int idx,String word,boolean[][] v){
        if(idx == word.length()){
            return true;
        }
        if(i<0||j<0||i>=mat.length||j>=mat[0].length||mat[i][j]!=word.charAt(idx)){
            return false;
        }
        v[i][j] = true;
        if(check(mat, i, j-1, idx+1, word,v) || check(mat, i, j+1, idx+1, word,v) || check(mat, i-1, j, idx+1, word,v)|| check(mat, i+1, j, idx+1, word,v)){
            return true;
        }
        v[i][j] = false;
        return false;
    }
}
