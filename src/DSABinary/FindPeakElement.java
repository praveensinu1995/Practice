package DSABinary;

public class FindPeakElement {

	public static void main(String[] args) {
		System.out.println(findPeakElement(new int[] {1,10,9,7,6,5,4,2,1,0}));
	}
	public static int findPeakElement(int[] nums) {
		int low=0;
		int high=nums.length-1;
		while (low<high) {
			int mid=(low+high)/2;
			if(nums[mid-1]<nums[mid]&&nums[mid]>nums[mid+1]) {
				return mid;
			}
			if(nums[mid-1]<nums[mid]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		
		return 0;
	}
}
