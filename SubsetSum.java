import java.util.*;

public class SubsetSum {
    // Helper function to solve subset sum problem using dynamic programming and store path
    static boolean subsetSumUtil(int ind, int target, int[] arr, int[][] dp, List<Integer> path) {
        if (target == 0)
            return true;
        if (ind == 0) {
            if (arr[0] == target) {
                path.add(arr[0]);
                return true;
            } else {
                return false;
            }
        }
        if (dp[ind][target] != -1)
            return dp[ind][target] == 1;

        // Not including the current element
        if (subsetSumUtil(ind - 1, target, arr, dp, path)) {
            dp[ind][target] = 1;
            return true;
        }

        // Including the current element if it's not greater than target
        if (arr[ind] <= target) {
            path.add(arr[ind]);
            if (subsetSumUtil(ind - 1, target - arr[ind], arr, dp, path)) {
                dp[ind][target] = 1;
                return true;
            }
            path.remove(path.size() - 1); // backtrack
        }

        dp[ind][target] = 0;
        return false;
    }

    static boolean subsetSumToK(int n, int k, int[] arr, List<Integer> path) {
        int[][] dp = new int[n][k + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return subsetSumUtil(n - 1, k, arr, dp, path);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Get size of array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Get array elements
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get target sum
        System.out.print("Enter the target sum: ");
        int k = sc.nextInt();

        List<Integer> path = new ArrayList<>();
        if (subsetSumToK(n, k, arr, path)) {
            System.out.println("Subset with the given target found");
            System.out.println("Subset: " + path);
        } else {
            System.out.println("Subset with the given target not found");
        }

        sc.close();
    }
}
