package DSA_Array;

import java.util.Arrays;
import java.util.Iterator;

public class dsaprac {
	 static dsaprac d=new dsaprac();
	public static void main(String[] args) {
		int [] arr= {2,5,7,6,8};
		
//		d.largestNoInArray(arr);
		int [] binaryArray= {2,5,7,11,22,44,56,66};
//		d.findNoInArrayByBinarySearch(binaryArray,22);
		int [] subArray = {-2,1,-3,4,-1,2,1,-5,4};
//		d.findMaxSubArray(subArray);
//		Move all zeros to end
		int [] nums= {0,1,0,3,12};
//		d.moveZerosToEnd(nums);
		int [] rotate= {1,2,3,4,5,6,7,8};
		int k=3;
//		d.rotateAnArray(rotate,k);
	d.reverseAnArray(rotate,0, rotate.length-1);
//	sort an array
	
		
	}
	
	private void reverseAnArray(int[] rotate, int start, int end) {
		while (start<=end) {
			int temp=rotate[start];
			rotate[start]=rotate[end];
			rotate[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(rotate));
		
	}

	private void rotateAnArray(int[] rotate, int k) {
		
		d.sawp(rotate,0,rotate.length-1);
		d.sawp(rotate, k,rotate.length-1 );
		d.sawp(rotate, 0, k-1);
		System.out.println(Arrays.toString(rotate));
	 	
	}

	private void sawp(int[] rotate, int start, int end) {
		while (start<end) {
			int temp=rotate[start];
			rotate[start]=rotate[end];
			rotate[end]=temp;
			start++;
			end--;
		}
		
	}

	private void moveZerosToEnd(int[] nums) {
		int nonZero=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				int tepm=nums[nonZero];
				nums[nonZero]=nums[i];
				nums[i]=tepm;
				nonZero++;
			}
		}
	 System.out.println(Arrays.toString(nums));
		
	}

	public void findMaxSubArray(int [] arr) {
		int max=Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			 max = Math.max(max, sum);
			if (sum<0) {
				sum=0;
			}
		}
		System.out.println(max);
	}
	public void findNoInArrayByBinarySearch(int [] arr,int target) {
		int start=0;
		int end=arr.length-1;
		System.out.println(arr.length-1);
		while (start<=end) {
			int mid=start+ (end-start)/2;
			if(arr[mid]==target) {
				break;
			}else if (target>arr[mid]) {
				start=mid+1;
				
			}else {
				end=mid-1;
			}
		}
		
	}
	
	
	public void largestNoInArray(int [] arr) {
		int max=arr[0];
		int j=arr.length-1;
		for (int i = 1; i < arr.length; i++) {
			if(i<j) {
				if(arr[i]>max) {
					max=arr[i];
				}
				if (arr[j]>max) {
					max=arr[j];
				}
			}
			j--;
		}
		System.out.println(max);
	}
}
