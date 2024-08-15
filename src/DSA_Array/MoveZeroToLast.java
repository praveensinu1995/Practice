package DSA_Array;

import java.util.Arrays;

public class MoveZeroToLast {

	public static void main(String[] args) {
		int []nums= {0,2,3,0,0,4,4,5};
		moveZero(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void moveZero(int[] nums) {
		int nonZero=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=0) {
				System.out.println(nums[i]);
				int temp=nums[nonZero];
				nums[nonZero]=nums[i];
				nums[i]=temp;
				nonZero++;
				System.out.println(nonZero+" nonZero");
			}
		}
		
	}
}
