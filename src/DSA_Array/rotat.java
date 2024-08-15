package DSA_Array;

import java.util.Arrays;

public class rotat {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 5;
		System.out.println(Arrays.toString(rotateArrayKtime(nums, k)));
	}

	private static int[] rotateArrayKtime(int[] nums, int k) {
		reverse(nums, 0, nums.length - 1);
		reverse(nums, k, nums.length - 1);
		reverse(nums, 0, k-1);
		return nums;
	}

	private static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int tenp = nums[start];
			nums[start] = nums[end];
			nums[end] = tenp;
			start++;
			end--;
		}
	}
}
