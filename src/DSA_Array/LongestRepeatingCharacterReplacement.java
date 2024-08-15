package DSA_Array;

//You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
//
//Return the length of the longest substring containing the same letter you can get after performing the above operations.
//
//Example 1:
//
//Input: s = "ABAB", k = 2 
//Output: 4
//Explanation: Replace the two 'A's with two 'B's or vice versa.
//Example 2:
//
//Input: s = "AABABBA", k = 1 
//Output: 4
//Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
//
//The substring "BBBB" has the longest repeating letters, which is 4.
public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		String s="AABABBA";
		System.out.println(characterReplacement(s, 2));
	}
	
	public static int characterReplacement(String s, int k) {
		int count=0;
		String replace = s.replace('A', 'B');
		System.out.println(replace);
		for (int i = 0; i < replace.length(); i++) {
			if (replace.charAt(i)=='B') {
				count++;
			}
		}
		return count;
	}

}
