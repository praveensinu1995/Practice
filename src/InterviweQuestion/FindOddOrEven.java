package InterviweQuestion;

public class FindOddOrEven {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			if ((i & 1) == 0) {
				System.out.println(" no " + i + " is an even no");
			} else {
				System.out.println(" no " + i + " is an odd no");
			}
		}
	}
}
