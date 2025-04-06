package Shashank.WebAutomation.Interview_Preparation.ex_2025_04_April.ex_06042025;

public class MinimumCostToPaintHouses {
    public int minCostII(int[][] costs) {

        // Step 1: Guard Clauses for Edge Cases
        if (costs == null || costs.length == 0 || costs[0].length == 0) {
            return 0;
        }

        // Step 2: Variable Initialization
        int n = costs.length;
        int k = costs[0].length;

        // Step 3: Impossible Case Handling
        if (k == 1) {
            if (n == 1) {
                return costs[0][0];
            } else {            // If only 1 color and more than 1 house, it violates the “no adjacent same color” rule.
                return -1;      // So, we return -1.
            }
        }

//        Step 4: DP Table Setup
        int[][] dp = new int[n][k]; // This table will store minimum cost to paint house i with color j.

        // Step 5: Fill First Row of DP Table
        for (int j = 0; j < k; j++) {
            dp[0][j] = costs[0][j];     // First house, paint it with any color. Cost is direct from costs.
        }

        //  Step 6: Fill Remaining DP Table
        // i → house index, j → current color, m → previous house’s color
        // For each color j of house i, we’re finding the minimum cost from previous row (i-1) for all different colors (m != j), then add the current cost costs[i][j].
        //This enforces the “no two adjacent same color” rule.
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

        // Step 7: Find the Minimum in the Last Row
        // After processing all houses, we find the minimum value in the last row, which gives the overall minimum cost.
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