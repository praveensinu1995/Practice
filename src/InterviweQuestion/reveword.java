package InterviweQuestion;

public class reveword {

	public static void main(String[] args) {
		String str="one two three ";
		String word="";
		String revStr="";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ') {
				word=str.charAt(i)+word;
			}else {
				revStr=revStr+word;
				revStr+=" ";
				word="";
			}
		}
		System.out.println(revStr+word);
	}
}
