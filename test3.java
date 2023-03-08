public class test3 {
    public static void main(String args[]) {
        int n = 7;
        int[][] pattern = new int[n][n];
        
        for (int r = 0; r < n; r++) { // iterate through rows of the matrix
            for (int c = 0; c < n; c++) { // iterate through columns of the matrix
                if (r % 2 == 0) { // if row index is even
                    if (c >= r && c < n - r) {
                        pattern[r][c] = 0;
                        pattern[c][r] = 0;
                    }
                } else { // if row index is odd
                    if (c >= r && c < n - r) {
                        pattern[r][c] = 1;
                        pattern[c][r] = 1;
                    }
                }
            }
        }
        
        for (int i = 0; i < n; i++) { // iterate through rows from top to bottom
            for (int j = n - 1; j >= 0; j--) { // iterate through elements in each row from right to left
                System.out.print(pattern[i][j]);
            }
            System.out.println(" ");
        }
        
    }
}
