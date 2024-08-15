package DSA_Array;

//Given an array nums of n integers . Find the maximum number from an array.
//
//Example 1:
//
//Input : nums=[1,20,-10,30]
//Output: 30
//The maximum element from an array is 30
//Example 2:
//
//Input: nums=[-10,-20,0,-30,5]
//Output:5

public class LargestElementInTheArray {

	public static void main(String[] args) {
		int [] nums={-10,-20,0,-30,5};
		System.out.println("Largest element in the array :"+ findLargestElement(nums));
	}
	public static int findLargestElement(int []nums) {
		int largestNo=nums[0];
		for(int i=1;i<nums.length;i++) {
			if (largestNo<nums[i]) {
				largestNo=nums[i];
			}
		}
      return largestNo;
    }
}
