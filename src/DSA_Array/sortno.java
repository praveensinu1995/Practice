package DSA_Array;

import java.util.Arrays;
import java.util.Iterator;

public class sortno {

	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(sortcolor(new int[] { 1, 1, 0, 0, 2, 2 })));
	}

	public static int[] sortcolor(int[] nums) {

		int start = 0;
		int mid = 0;
		int end = nums.length - 1;
		while (mid < end) {
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
	}

	public static void swap(int[] nums, int start, int mid) {
		int temp = nums[start];
		nums[start] = nums[mid];
		nums[mid] = temp;
	}
}
