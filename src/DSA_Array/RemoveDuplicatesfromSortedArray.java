package DSA_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.management.AttributeList;

//Given an integer array nums sorted in non-decreasing order, remove the duplicates  such that each unique element appears only once and return the new array.
//
//Example 1:
//
//Input: nums = [1,1,2] 
//Output: [1,2]
//Explanation: Array after removing duplicates are [1,2]
public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		System.out.println("proper array "+ removeDuplicates(new ArrayList<>(Arrays.asList(1,1,2,1,2,2))));
	}
	public static List<Integer> removeDuplicates(List<Integer> nums) {
		List<Integer> list=new ArrayList<>();
		list.add( nums.get(0));
		for (int i = 1; i < nums.size(); i++) {
			if(nums.get(i-1)!=nums.get(i)) {
				list.add(nums.get(i));
			}
		}
		return list;
		
 	}
}

