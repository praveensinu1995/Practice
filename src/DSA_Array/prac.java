package DSA_Array;

import java.util.Arrays;

public class prac {

	public static void main(String[] args) {

		int[] sortCollornums = { 0, 1, 2, 0, 2, 1 };
		int[] binarySearchArray = { 1, 2, 5, 8, 9, 10, 22, 50 };
		int searchNum = 22;
//		System.out.println(Arrays.toString(sortCollor(sortCollornums)));
		System.out.println(binarySearchInArray(binarySearchArray, searchNum));

	}

	private static int binarySearchInArray(int[] binarySearchArray, int searchNum) {
		int low=0;
		int high=binarySearchArray.length-1;
		while(low<high) {
			int mid=(high+low)/2;
			if(binarySearchArray[mid]==searchNum) {
				return mid;
			}else {
				if(searchNum>binarySearchArray[mid]) {
					low=mid;
				}else {
					high=mid-1;
				}
			}
		}
	
		return 0;
	}

	public static int[] sortCollor(int[] nums) {

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

	private static void swap(int[] nums, int start, int mid) {

		int temp = nums[start];
		nums[start] = nums[mid];
		nums[mid] = temp;

	}
}