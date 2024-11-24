package dynamic_programming.basic;

public class CoinChangeProblem {
	public static void main(String[] args) {
		System.out.println(getCount(new int[] { 1, 2, 5 }, 5));
	}

	public static int getCount(int[] coins, int amount) {
		int dp[] = new int[amount + 1];
		dp[0] = 1;

		for (int coin : coins) {
			for (int i = coin; i <= amount; i++) {
				dp[i] += dp[i - coin];
			}
		}
		return dp[amount];
	}
}
