package DSA_MathCOde;
//
//Given an integer num, return the number of digits in num that divide num.
//
//An integer val divides nums if nums % val == 0

//Example 1:
//
//Input: num = 121 
//Output: 2
//Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2
//
//Input: num = 1248 
//Output: 4
//Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
public class CounttheDigitsThatDivideaNumber {

	public static void main(String[] args) {
		
		System.out.println("the Digits That Divide a given Number:"+countDigits(1248));
	}
	public static int countDigits(int num) {
		int temp=num;
		int count=0;
		while (temp>0) {
			int rem=temp%10;
			if (num%rem==0) {
				count++;
			}
			temp/=10;
		}
		return count;
	}
}
