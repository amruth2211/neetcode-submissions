class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int top=0, bottom = row - 1;
        while(top <= bottom){
            int row1 = (top + bottom) / 2;
            if(target > matrix[row1][col-1]){
                top = row1 + 1;
            }
            else if (target < matrix[row1][0])
            {
                bottom = row1 -1;
            }
            else{
                break;
            }
        }

        if(!(top <= bottom)){
            return false;
        }

        int row2 = (top + bottom)/2;
        int l = 0, r = col - 1;
        while (l <= r){
            int m = (l+r)/2;
            if(target > matrix[row2][m]){
                l = m+1;
            }
            else if(target < matrix[row2][m]){
                r = m - 1;
            }
            else{
                return true;
            }
        }

        return false;
    }
}
