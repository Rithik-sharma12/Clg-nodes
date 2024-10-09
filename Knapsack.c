#include <stdio.h>
int i;
// A utility function to return the maximum of two integers
int max(int a, int b) {
    return (a > b) ? a : b;
}

// Function to solve the knapsack problem using dynamic programming
void knapsack(int W, int wt[], int val[], int n) {
    int i, w;
    int dp[n+1][W+1];

    // Build the dp[][] table in a bottom-up manner
    for (i = 0; i <= n; i++) {
        for (w = 0; w <= W; w++) {
            if (i == 0 || w == 0) {
                dp[i][w] = 0;
            } else if (wt[i-1] <= w) {
                dp[i][w] = max(val[i-1] + dp[i-1][w - wt[i-1]], dp[i-1][w]);
            } else {
                dp[i][w] = dp[i-1][w];
            }
        }
    }

    // Print the final DP table (for debugging or visualization)
    printf("DP Table:\n");
    for (i = 0; i <= n; i++) {
        for (w = 0; w <= W; w++) {
            printf("%d ", dp[i][w]);
        }
        printf("\n");
    }

    // Print the result (maximum value that can be obtained)
    printf("Maximum value in knapsack = %d\n", dp[n][W]);
}

int main() {
    int n, W;

    // Input the number of items
    printf("Enter the number of items: ");
    scanf("%d", &n);

    int val[n], wt[n];

    // Input the values of the items
    printf("Enter the values of the items:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &val[i]);
    }

    // Input the weights of the items
    printf("Enter the weights of the items:\n");
    int i;
    for ( i = 0; i < n; i++) {
        scanf("%d", &wt[i]);
    }

    // Input the maximum capacity of the knapsack
    printf("Enter the maximum capacity of the knapsack: ");
    scanf("%d", &W);

    // Call the knapsack function to solve the problem
    knapsack(W, wt, val, n);

    return 0;
}
