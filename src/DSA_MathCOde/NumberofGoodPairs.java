package DSA_MathCOde;

import java.util.Iterator;

//Given an array of integers nums, return the number of good pairs.
//
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.

//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
//Input: nums = [1,1,1,1]
//Output: 6
//Explanation: Each pair in the array are good.
public class NumberofGoodPairs {

	public static void main(String[] args) {

		int count=0;
		int []  nums = {1,1,1,1};
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			} 
		}
		System.out.println("no of good pairs are:"+count);
	}
}
