package DSA_Array;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//"Given an array A[] of size N containing non-negative integers. 
//You have to move all 0's to the end of array while maintaining the 
//relative order of the non-zero elements.
//
//Note:
//
//You must do this in-place without making a copy of the array.
//
//Minimize the total number of operations."
//
//Example 1:
//
//Input: nums = [0,1,0,3,12] 
//Output: [1,3,12,0,0]
//Explanation: 
public class MoveZeros {

	public static void main(String[] args) {
		int [] nums= {1,1,0,3,12};
		int [] result=moveZerosWithOutNewArray(nums);
		System.out.println("the new array of moving zero's to end "+ Arrays.toString(result));

	}
	public static int[] moveZeros(int[] nums) {
		 int[] a = new int[nums.length];
		int j=0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				a[j]=nums[i];
				j++;
			}
		}
		return a;
	}
	public static int[] moveZerosWithOutNewArray(int[] nums) {
		int nonZero=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=0) {
				int temp=nums[nonZero];
				nums[nonZero]=nums[i];
				nums[i]=temp;
				nonZero++;
			}
		}
		return nums;
	}
}
