package InterviweQuestion;

public class ReversAWordInString {

	public static void main(String[] args) {
		
		String str="one two three";
		String revStr="";
		String word="";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)!=' ') {
				word=str.charAt(i)+word;
			}else {
				revStr=revStr+word;
				revStr=revStr+" ";
				word="";
			}
		}
		System.out.println(revStr+word);
	}
}

