package Code;

public class reverseANo {

	public static void main(String[] args) {
		int num=345;
		int temp=num;
		int sum=0;
		while (num>0) {
			int rem=num%10;
			sum=sum*10+rem;
			num/=10;
		}
		System.out.println("no u gave "+temp+" a which has reversed "+sum);
	}
}
