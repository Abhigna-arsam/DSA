// You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.

// Input: mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]
// Output: [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]


class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        int top = 0; int bottom = mat.length-1;
        int left = 0; int right = mat[0].length-1;
        ArrayList<Integer> arr = new ArrayList<>();
        while(left <= right && top <= bottom){
            for(int i = left; i<=right;i++){
                arr.add(mat[top][i]);
            }
            top++;
            for(int i = top; i<=bottom;i++){
                arr.add(mat[i][right]);
            }
            right--;
            if(top <= bottom){
            for(int i = right; i>=left;i--){
                arr.add(mat[bottom][i]);
            }
            bottom--;
            }
            
            if(left <= right){
            for(int i = bottom; i>=top;i--){
                arr.add(mat[i][left]);
            }
            left++;
            }
            


        }
        return arr;
    }
}
