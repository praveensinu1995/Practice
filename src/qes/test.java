package qes;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 4, 5, 6 };
		List<Integer> arr3 = new ArrayList<>();
		int sec=0;
		int count = arr1.length + arr2.length;
		for (int i = 0; i < count; i++) {
			if (i < arr1.length) {
				arr3.add(arr1[i]);
			} else {
				arr3.add(arr2[sec]);
				sec++;
			}
		}
		System.out.println(arr3);
	}
}
