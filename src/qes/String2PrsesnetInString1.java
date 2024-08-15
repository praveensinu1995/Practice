package qes;

//s1="stackoverflow" s2="overflowstack" are of equal length check whether s2 is rotated version of s1
public class String2PrsesnetInString1 {

	public static void main(String[] args) {
		System.out.println("String2 Prsesnet In String1 :"+check("stackoverflow","OVERFlow"));
		
	}

	private static boolean check(String string, String string2) {
//		string=string.toLowerCase();
//		string2=string2.toLowerCase();
		
		string=string+string;
		
		return string.contains(string2);
	}
}
