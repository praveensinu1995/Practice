package DSABinary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.
//
//Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.
//
//Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.
//
//Example 1:
//
//Input: aliceSizes = [1,1], bobSizes = [2,2] 
//Output: [1,2]
//Explanation: 
//Example 2:
//
//Input: aliceSizes = [1,2], bobSizes = [2,3] 
//Output: [1,2]
//Explanation: 
public class FairCandySwap {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(fairCandySwap(new int[] { 1, 3 }, new int[] { 2, 2 })));
	}

	public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		int[] result = new int[2];
		int a = 0;
		int b = 0;
		Set<Integer> set = new HashSet<>();
		for (int alice : aliceSizes)
			a += alice;
		for (int bob : bobSizes) {
			b += bob;
			set.add(bob);
		}
		int dif = (b - a) / 2;
		for (Integer integer : aliceSizes) {
			if (set.contains(integer + dif)) {
				result[0] = integer;
				result[1] = integer + dif;
				return result;
			}
		}
		return result;
	}
}
