package Code;

public class palendrom {

	public static void main(String[] args) {
		int year=222;
		
		int temp=year;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum=sum*10+rem;
			temp/=10;
		}
		if(year==sum) {
			System.out.println(year+" it  is palendrom ");
		}else {
			System.out.println(year+" is not an palendrom ");
		}
	}
}
