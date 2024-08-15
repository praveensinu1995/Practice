package Code;

public class Sum_of_first_last_no {

	public static void main(String[] args) {
		int a=3339;
		
		int firstDigit=a;
		int lastDigit=a%10;
		while(firstDigit>10) {
			firstDigit/=10;
		}
		System.out.println("the sum of last and first digit is "+ (firstDigit+lastDigit));
	}
}
