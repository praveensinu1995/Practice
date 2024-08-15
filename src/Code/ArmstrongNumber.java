package Code;

import java.util.Iterator;

public class ArmstrongNumber {

//	An Armstrong number of three digits is an integer such that the sum 
//	of the cubes of its digits is equal to the number itself. 
//	For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
//	Write a program to find all Armstrong number in the range of 0 and 999.
	public static void main(String[] args) {

		int no = 371;
		int restor = no;
		int sum = 0;

//		while(restor>0) {
//			int rem=restor%10;
//			sum+=(rem*rem*rem);
//			restor/=10;
//		}
//		
//		if (no==sum) {
//			System.out.println("ArmstrongNumber");
//		}
//		else {
//			System.out.println("not an ArmstrongNumber");
//		}
		
		
		
		System.out.println("hi");
		
		
		
		
		
		
		while (no > 0) {
			int rem = no % 10;
			int tepm = 1;
			for (int i = 1; i <= 3; i++) {
				tepm *= rem;
			}
			sum += tepm;
			no /= 10;
		}
		if (restor == sum) {
			System.out.println(restor + " it is an armstrong no");
		} else
			System.out.println(restor + " is not an armstrong no");
	}
}
