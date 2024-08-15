package Code;

public class LargestOf2 {

	public static void main(String[] args) {
		int a=49;
		int b=200;
		int c=155;
		int sum=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(sum);
		
	}
}
