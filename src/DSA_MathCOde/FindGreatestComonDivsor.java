package DSA_MathCOde;

public class FindGreatestComonDivsor {

	public static void main(String[] args) {
		int arr[] = { 8, 9, 12 };
		int a = arr[0];
		int b = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (a < arr[i]) {
				a = arr[i];
			}
			if (b > arr[i]) {
				b = arr[i];
			}
		}

		int gcd = 0;
		for (int i = 1; i <= (a < b ? a : b); i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println("gcd is:" + gcd);
	}
}
