package qes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import DSA_Array.binarysearch;

//int []nums= {1,2,2,3,3,3} 
//int k=2 ;
//output=[2,3]
public class FindNumWhichIsMostFreqentlyAppered {
	public static void main(String[] args) {
		int[] nums = { 6,1, 2, 5, 3, 3, 3 ,3};
		int k = 2;
		System.out.println(Arrays.toString(find(nums,k)));
//		System.out.println(Arrays.toString(arySort(nums)));
	}

	private static int[] arySort(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-i-1; j++) {
				if (nums[j]<nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		return nums;
	}

	private static int[] find(int[] nums, int k) {
		Map<Integer, Integer> map=new HashMap<>();
		int [] resul=new int[k];
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i], 1);
			}
			
		}
		List<Map.Entry<Integer, Integer>> list=new ArrayList<>(map.entrySet());
		list.sort((a,b)->b.getValue().compareTo(a.getValue()));
	
		for (int i = 0; i < k; i++) {
			resul[i]=list.get(i).getKey();
		}
		return resul;
	}
}
