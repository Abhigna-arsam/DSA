// Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find whether the number x is present in the matrix or not.
// Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.

// Examples:

// Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
// Output: true
// Explanation: 14 is present in the matrix, so output is true.

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int m = mat[0].length;
        
        int col = m-1;
        int row = 0;
        while(row < mat.length && col>=0){
        int cellVal = mat[row][col];
        if(x == cellVal){
            return true;
        }
        if(x < cellVal){
            col--;
        }
        else if(x > cellVal){
            row++;
        }
    }
    return false;
    
    }
}
