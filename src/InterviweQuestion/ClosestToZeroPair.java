package InterviweQuestion;

public class ClosestToZeroPair {
	public static void main(String[] args) {
		int[] a = { 1, -2, 4, -6, -1 };
		findPairClosestToZero(a);
	}

	public static void findPairClosestToZero(int[] a) {
		if (a == null || a.length < 2) {
			System.out.println("Array should have at least two elements.");
			return;
		}

		int minPositiveSum = Integer.MAX_VALUE;
		int maxNegativeSum = Integer.MIN_VALUE;
		int posPair1 = 0, posPair2 = 0;
		int negPair1 = 0, negPair2 = 0;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int sum = a[i] + a[j];
				if (sum >= 0 && sum < minPositiveSum) {
					minPositiveSum = sum;
					posPair1 = a[i];
					posPair2 = a[j];
				} else if (sum < 0 && sum > maxNegativeSum) {
					maxNegativeSum = sum;
					negPair1 = a[i];
					negPair2 = a[j];
				}
			}
		}

		if (minPositiveSum <= -maxNegativeSum) {
			System.out.println("Pair closest to zero: (" + posPair1 + ", " + posPair2 + ")");
		} else {
			System.out.println("Pair closest to zero: (" + negPair1 + ", " + negPair2 + ")");
		}
	}
}
