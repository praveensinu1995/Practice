package DSA_Array;

import java.util.Arrays;
import java.util.Iterator;

//Given an array nums of n elements . Complete the given function and return the reversed array .
//
//Example 1:
//
//Input: nums=[1,2,3,4]
//Output: nums=[4,3,2,1]
//Example 2:
//
//Input: nums=[9,1,2,6]
//Output: nums=[6,2,1,9]

public class ReverseAArray {

	public static void main(String[] args) {
		int [] nums= {1,2,3,4};
		System.out.println(Arrays.toString( reverseArray(nums)));
		}
	
	public static int[] reverseArray(int[] nums) {
		int j=nums.length-1;
		for (int i = 0; i <=j; i++) {
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			j--;
		}
      return nums;
      
    }

}
