package qes;

public class countStaries {

	public static void main(String[] args) {
		int n=10;
		System.out.println(countWays(n));
		
	}

	private static int countWays(int n) {
		if (n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		
		
		int [] dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for (int i = 2; i <=n; i++) {
			dp[i]=dp[i-1]+dp[i-2];
			System.out.println(dp[i]);
		}
		System.out.println("hi"+dp[n]);
		return dp[n];
	}
}
