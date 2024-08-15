package DSA_Array;

import java.util.Iterator;

//Given a binary string s of 0's and 1's. The task is to find the maximum difference between the number of 0s and the number of 1s (number of 0s — number of 1s) for a substring . In case of all 1s print -1.
//
//Example 1:
//
//Input: s = "11000010001" 
//Output: 6
//Explanation: From index 2 to index 9, there are 7
//
//0s and 1 1s, so number of 0s - number
//
//of 1s is 6.
//Example 2:
//
//Input: s = "11" 
//Output: -1
//Explanation: 
public class MaximumDifferenceofzerosonesinaBinaryString {

	public static void main(String[] args) {
		
//		System.out.println(getMaxDifference("1100001"));
		System.out.println(findDiffOfZero("11000010001"));
		System.out.println(name("11000010001"));
	}
	
	public static int name(String str) {
		int sum=0;
		int maxSum=0;
		for (int i = 0; i < str.length(); i++) {
			sum+=str.charAt(i)=='0'?1:-1;
			if(sum<0)sum=0;
			maxSum=Math.max(maxSum, sum);
		}
		return maxSum==0?-1:maxSum;
	}
	
	public static int findDiffOfZero(String str) {
		int sum=0;
		int maxSum=0;
		for (int i = 0; i < str.length(); i++) {
			sum+=str.charAt(i)=='0'?1:-1;
			if (sum<0) {
				sum=0;
			}maxSum=Math.max(maxSum, sum);
		}
		return maxSum==0?-1:maxSum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static  int getMaxDifference(String s) {
		int sum=0;
		int maxSum=0;
		for (int i = 0; i < s.length(); i++) {
			sum+=s.charAt(i)=='0'?1:-1;
			if(sum<0)sum=0;
			maxSum=maxSum>sum?maxSum:sum;
		}
		return maxSum==0?-1:maxSum;
		
	}

}
