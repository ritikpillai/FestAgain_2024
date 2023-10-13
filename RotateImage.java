class Solution {
    public void rotate(int[][] matrix) {
        int start = 0;
        int last = matrix.length-1;
        for(int i=0; i<last; i++){
            int[] temp = matrix[last];
            matrix[last] = matrix[i];
            matrix[i] = temp;
            start++;
            last--;
        }

        for(int i=0; i<matrix.length-1; i++){
            for(int j=i+1; j<=matrix.length-1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
