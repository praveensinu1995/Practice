package qes;

import java.util.Arrays;
import java.util.Iterator;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = { 6, 1, 2, 5, 3, 3, 3, 3 };
		System.out.println(Arrays.toString(bubbleSort(nums)));
		System.out.println(Arrays.toString(bubbleSortRev(nums)));
	}

	private static int[] bubbleSortRev(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] < nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}

		return nums;
	}

	private static int[] bubbleSort(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		return nums;
	}
}
