package Code;

public class StrongNo {

	public static void main(String[] args) {
		int strong = 40585;
		int temp = strong;
		int sum = 0;
		while (temp > 0) {
			int rem = temp % 10;
			int facOfEchno = 1;
			for (int i = 1; i <= rem; i++) {
				facOfEchno *= i;
			}
			sum += facOfEchno;
			temp /= 10;
		}
		if (strong == sum) {
			System.out.println(strong + " is a strong no");
		} else {
			System.out.println(strong + " is not a strong no");
		}
	}
}
