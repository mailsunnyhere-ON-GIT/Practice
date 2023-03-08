public class test2 {
    public static void main(String args[]) {
        int n = 7;
        int[][] pattern = new int[n][n];
        for (int i = 0; i < n; i = i + 2) {
            for (int j = i; j < n - i; j++) {
                pattern[i][j] = 0;
                pattern[j][i] = 0;
            }
        }
        for (int i = 1; i < n; i = i + 2) {
            for (int j = i; j < n - i; j++) {
                pattern[i][j] = 1;
                pattern[j][i] = 1;
            }
        }
        for (int i = 0; i < n; i++) { // iterate through rows from top to bottom
            for (int j = 0; j < n - i; j++) { // iterate through elements in each row from left to right
                System.out.print(pattern[i][j]);
            }
            System.out.println(" ");
        }
        
    }
}
