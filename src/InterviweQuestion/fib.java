package InterviweQuestion;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ....
public class fib {

	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c=0;
		while (a<100) {
			c=a;
			System.out.println(c);
			a=b;
			b=b+c;
		}
	
	}
}
