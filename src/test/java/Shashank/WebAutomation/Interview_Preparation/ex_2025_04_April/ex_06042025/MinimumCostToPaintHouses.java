package Shashank.WebAutomation.Interview_Preparation.ex_2025_04_April.ex_06042025;

public class MinimumCostToPaintHouses {
    public int minCostII(int[][] costs) {

        if (costs == null || costs.length == 0 || costs[0].length == 0) {
            return 0;
        }

        int n = costs.length;
        int k = costs[0].length;

        if (k == 1) {
            if (n == 1) {
                return costs[0][0];
            } else {
                return -1;
            }
        }

        int[][] dp = new int[n][k];
        for (int j = 0; j < k; j++) {
            dp[0][j] = costs[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int m = 0; m < k; m++) {
                    if (m != j) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][m] + costs[i][j]);
                    }
                }
            }
        }

        int minCost = Integer.MAX_VALUE;
        for (int j = 0; j < k; j++) {
            minCost = Math.min(minCost, dp[n - 1][j]);
        }

        return minCost;
    }

    public static void main(String[] args) {

        MinimumCostToPaintHouses solution = new MinimumCostToPaintHouses();

        int[][] costs_1 = {
                {1,5,3},
                {2,9,4}
        };
        int output1 = solution.minCostII(costs_1);
        System.out.println("Output 1: " + output1);

        int[][] costs_2 = {
                {1,3},
                {2,4}
        };
        int output2 = solution.minCostII(costs_2);
        System.out.println("Output 2: " + output2);
    }
}
