package DSA_Array;
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
public class MaximumSubarray {

	public static void main(String[] args) {
		int [] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
		System.out.println(subArray(nums));
	}
	
	public static int subArray(int [] nums) {
		int sum=0;
		int maxSum=Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {

			sum+=nums[i];
			maxSum=Math.max(maxSum, sum);
			if(sum<0)sum=0;
		}
		return maxSum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  public static int maxSubArray(int[] nums) {
			int sum = 0;
			int maxSum = Integer.MIN_VALUE;
			for (int i = 0; i < nums.length; i++) {
				sum += nums[i];
				maxSum=maxSum>sum?maxSum:sum;
				if (sum < 0) {
					sum = 0;
				}
			}
			return maxSum;
	    }

}
