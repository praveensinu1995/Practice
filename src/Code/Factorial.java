package Code;

public class Factorial {

	public static void main(String[] args) {
		
		long fac=5;
		long sum=1;
		for(int i =1;i<=fac;i++) {
			sum*=i;
		}
		System.out.println(sum);
	}
}
