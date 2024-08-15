package DSA_Array;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Iterator;

public class binarysearch {

	public static void main(String[] args) {
		
		System.out.println("binarySearchByUnsortedArry()");
		binarySearchByUnsortedArry();
		System.out.println("binarySearchBySortedArry()");
		binartSearchForSortedArray();
		System.out.println("searech a no in an array by linearSearch");
		linearSearch();
		System.out.println("sort the number:boubleSort");
		boubleSort();
	}
	
	private static void boubleSort() {
		int [] nums= {8,9,5,0,77,6,19,1,2,4,5,6};
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < nums.length-i; j++) {
				if (nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

	private static void linearSearch() {
		
		int [] nums= {8,9,5,0,77,6,19,1,2,4,5,6};
		int j=nums.length-1;
		int i=0;
		int target=77;
		while (i<=j) {
			if(nums[i]==target) {
				System.out.println(i);
			}else if (nums[j]==target) {
				System.out.println(j);
			}
			i++;
			j--;
		}
	}

	public static  void binartSearchForSortedArray() {
		int [] ary= {2,4,6,8,100,198,500};
		int start=0;
		int target=500;
		int end=ary.length-1;
		while (start<=end) {
			int mid=(start+end)/2;
			if (ary[mid]==target) {
				System.out.println(mid);
				break;
			}else if (target>ary[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
	}
	public static void binarySearchByUnsortedArry() {
		int [] nums= {8,9,19,1,2,4,5,6};
		int strat=0;
		int end=nums.length-1;
		int target=1;
		while (strat<=end) {
			int mid=(strat+end)/2;
			if (nums[mid]==target) {
				System.out.println(mid);
				break;
			}else if (nums[strat]<nums[mid]) {
				if ( target>nums[strat]&&target<nums[mid]) {
					end=mid-1;
				}else {
					strat=mid+1;
				}
			}else {
				if (target>nums[mid]&&target<nums[end]) {
					strat=mid+1;
				}else {
					strat=mid-1;
				}
			}
		}
	}
}
