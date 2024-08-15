package DSA_MathCOde;

import java.util.Iterator;

//Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
//
//An integer m is a divisor of n if there exists an integer k such that n = k * m.
//
//Input: n = 2 
//Output: false
//Explanation:  2 has only two divisors: 1 and 2.
//
//Input: n = 4 
//Output: true
//Explanation: 4 has three divisors: 1, 2, and 4.
public class Three_Divisors {

	public static void main(String[] args) {
		System.out.println(isThree(4));

	}

	public static boolean isThree(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if (count==3) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
