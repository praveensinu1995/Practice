package DSA_Array;

import java.util.Arrays;
import java.util.Iterator;

//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//
//You must solve this problem without using the library's sort function.
//
//Example 1:
//
//Input: nums = [2,0,2,1,1,0] 
//Output: [0,0,1,1,2,2]
//Explanation: 
//Example 2:
//
//Input: nums = [2,0,1] 
//Output: [0,1,2]
//Explanation: 
public class SortColors {
	public static void main(String[] args) {
		int[] nums = { 2, 0, 1, 0, 2, 1, 1, 0 };
		System.out.println("the Sort Colors array" + Arrays.toString(sortColors(nums)));
	}

	public static int[] sortColors(int[] nums) {

		int start = 0;
		int mid = 0;
		int end = nums.length - 1;
		while (mid <= end) {
			switch (nums[mid]) {
			case 0: {
				swap(nums, start, mid);
				start++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				swap(nums, mid, end);
				end--;
				break;
			}
			}
		}
		return nums;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] > nums[j]) {
//					int temp = nums[i];
//					nums[i] = nums[j];
//					nums[j] = temp;
//				}
//			}
//		}
//		return nums;
	}

	private static void swap(int[] nums, int start, int mid) {
		int temp = nums[start];
		nums[start] = nums[mid];
		nums[mid] = temp;
	}
}
