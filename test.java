public class test {
    public static void main(String[] args) {
        int n = 7; // number of rows and columns
        int[][] pattern = new int[n][n];
        
        // fill the pattern array with 0's and 1's
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    pattern[i][j] = 0;
                } else if (i == 1 || i == n-2 || j == 1 || j == n-2) {
                    pattern[i][j] = 1;
                } else {
                    pattern[i][j] = 0;
                }
            }
        }
        
        // print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
