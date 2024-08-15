package DSA_Array;

//Given an array of integer nums . Find the second smallest element from an array.
//
//Example 1:
//
//Input: nums = [1,2,1,4,6] 
//Output: 2
//Explanation: 2 is the second smallest element from an array.
public class SecondSmallestElementInArray {

	public static void main(String[] args) {
		int [] nums= {5,666,99,1,4,6} ;
		System.out.println("Second Smallest Element In Array "+secondSmallest(nums));
	}
	public static int  secondSmallest(int[] nums) {
		int smallestNo=nums[0];
		int secondSmallest=nums[1];
		if(smallestNo>secondSmallest) {
			int temp=secondSmallest;
			secondSmallest=smallestNo;
			smallestNo=temp;
		}
		for(int i=2;i<nums.length;i++) {
			if(smallestNo>nums[i]) {
				secondSmallest=smallestNo;
				smallestNo=nums[i];
			}else if(secondSmallest>nums[i]&&smallestNo!=nums[i]){
				secondSmallest=nums[i];
			}
		}
		
		return secondSmallest;
	}
}
