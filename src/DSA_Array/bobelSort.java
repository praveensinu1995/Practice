package DSA_Array;

import java.util.Arrays;
import java.util.Iterator;

public class bobelSort {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 2, 4, 0, 8 };
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < nums.length - i; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
//				int largest=nums[0];
		
//		for(int i=0;i<nums.length;i++) {
//			for (int j = i+1; j < nums.length; j++) {
//				if(nums[i]>nums[j]) {
//					int temp=nums[i];
//					nums[i]=nums[j];
//					nums[j]=temp;
//				}
//			}
//			
//		}
		System.out.println(Arrays.toString(nums));
		
		
	}
}
