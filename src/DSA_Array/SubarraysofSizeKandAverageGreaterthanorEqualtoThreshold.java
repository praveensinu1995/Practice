package DSA_Array;

import java.util.Iterator;

//Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
//
//		 
//
//Example 1:
//
//Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
//Output: 3
//Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).
//Example 2:
//
//Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
//Output: 6
//Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
public class SubarraysofSizeKandAverageGreaterthanorEqualtoThreshold {

	public static void main(String[] args) {
		int[] arr = { 11, 13, 17, 23, 29, 31, 7, 5, 2, 3 };
		int k = 3;
		int threshold = 5;
		System.out.println("Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold is :"
				+ numOfSubarrays(arr, k, threshold));
	}

	public static int numOfSubarrays(int[] arr, int k, int threshold) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		if ((sum / k) >= threshold) {
			count++;
		}
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];
			sum -= arr[i - k];
			if ((sum / k) >= threshold) {
				count++;
			}
		}
		return count;
	}
}
