package Code;

public class primeNo {

	public static void main(String[] args) {
		int primeNo=25;
		int count=0;
		for(int i=2;i<primeNo;i++) {
			if (primeNo%i==0) {
				count++;
			}
		}
		if (count>=1) {
			System.out.println(primeNo +" is not a prime number");
		}else {
			System.out.println(primeNo +" is  a prime number");
		}
	}
}
