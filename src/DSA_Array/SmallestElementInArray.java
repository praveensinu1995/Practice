package DSA_Array;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int [] nums={-10,-20,0,-30,5};
		System.out.println("Largest element in the array :"+ findSmallest(nums));
	}
	public static int findSmallest(int []nums) {
		int largestNo=nums[0];
		for(int i=1;i<nums.length;i++) {
			if (largestNo>nums[i]) {
				largestNo=nums[i];
			}
		}
      return largestNo;
    }
}
