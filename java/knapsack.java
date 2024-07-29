import java.util.*;
/*static void included(int[][] matrix,int n,int capacity,int[] weights){
        boolean[] include = new boolean[n];
        int j = capacity;
        for (int i = n; i > 0 && j > 0; i--) {
            if (matrix[i][j] != matrix[i - 1][j]) {
                include[i - 1] = true;
                j -= weights[i -1];
            }
        }*/
class knapsack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of Objects ");
        int n = s.nextInt();
        int[] values = new int[n+1];
        int[] weights = new int[n+1];
        values[0] = weights[0] = 0;
        System.out.println("Profit of Objects - ");
        for(int i=1;i<=n;i++){
            values[i] = s.nextInt();
        }
        System.out.println("Weight of Objects - ");
         for(int i=1;i<=n;i++){
            weights[i] = s.nextInt();
        }
        System.out.println("Enter the Capacity of Sack ");
        int capacity = s.nextInt();

        int maximumProfit = knapsack(values, weights, capacity,n);
        System.out.println("Maximum Profit: " + maximumProfit);
    }

    public static int knapsack(int[] values, int[] weights, int capacity, int n) {
        //  int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
                }
            }
        }

        int result = dp[n][capacity];
        int w = capacity;
        List<Integer> selectedItems = new ArrayList<>();

        for (int i = n; i > 0 && result > 0; i--) {
            if (result == dp[i - 1][w]) {
                continue;
            } else {
                selectedItems.add(i - 1);
                result -= values[i - 1];
                w -= weights[i - 1];
            }
        }

        System.out.print("Selected items: ");
        for (int i = selectedItems.size() - 1; i >= 0; i--) {
            System.out.print(selectedItems.get(i) + " ");
        }
        System.out.println();

        return dp[n][capacity];
    }
        
    
}
