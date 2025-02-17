package qes;

import java.util.Arrays;

//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//A subarray is a contiguous part of an array.
//
//
//
//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//Example 2:
//
//Input: nums = [1]
//Output: 1
//Example 3:
//
//Input: nums = [5,4,-1,7,8]
//Output: 23
public class MaxSubArray {
	public static void main(String[] args) {
		int[] nums = { 1 };
		System.out.println(find(nums));
	}

	private static int find(int[] nums) {
		int sum = 0;
		int maxSum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum < 0) {
				sum = 0;
			}
			maxSum = maxSum > sum ? maxSum : sum;
		}
		return maxSum;
	}
}
