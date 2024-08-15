package qes;

import Code.reverseANo;

public class ques2 {

//	14,18,19,21, 29,34,2,6,10

	public static void main(String[] args) {

		int[] num = { 14, 18, 19, 21, 29, 34, 2, 6, 10 };
		int target = 10;
		int result = search(num, target);
		System.out.println(result);
	}

	private static int search(int[] num, int target) {
		int start = 0;
		int end = num.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (num[mid] == target) {
				return mid;
			}
			if (num[start] <= num[mid]) {
				if (target >= num[start] && target <= num[mid]) {

					end = mid - 1;
				} else {

					start = mid + 1;
				}
			} else {
				if (target >= num[mid] && target <= num[end]) {

					start = mid + 1;
				} else {
					System.out.println(mid);
					end = mid - 1;
				}
			}
		}

		return -1;
	}

}
