package Code;

public class factors {

	public static void main(String[] args) {
		int fact=25;
		for( int i=1;i<=fact;i++) {
			if(fact%i==0) {
				System.out.println(i);
			}
		}
	}
}
