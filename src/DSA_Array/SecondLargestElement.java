package DSA_Array;

import java.util.Iterator;

//Given an integer array nums return the second largest element from the array.
//
//Example 1:
//
//Input: nums = [5, 1, 4, 6, 6] 
//Output: 5
//Explanation: 5 is the second largest element from an array.
//Example 2:
//
//Input: nums = [-2, -3 , -1, 1] 
//Output: -1
//Explanation: -1 is the second largest element from an array.
public class SecondLargestElement {

	public static void main(String[] args) {
		int[] nums = { -2, -3, -1, 1 };
		System.out.println("Second Largest Element in array :" + secondLargest(nums));
	}

	public static int secondLargest(int[] nums) {
		int largestNo = nums[0];
		int SecondlargestNo = nums[1];
		if (SecondlargestNo > largestNo) {
			int temp = SecondlargestNo;
			SecondlargestNo = largestNo;
			largestNo = temp;
		}
		for (int i = 2; i < nums.length; i++) {
			if (largestNo < nums[i]) {
				SecondlargestNo = largestNo;
				largestNo = nums[i];
			} else if (SecondlargestNo < nums[i] && largestNo != nums[i]) {
				SecondlargestNo = nums[i];
			}

		}
		return SecondlargestNo;
	}
}
