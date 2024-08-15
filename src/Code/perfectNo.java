package Code;

public class perfectNo {

	public static void main(String[] args) {
		
		int a=8127;
		int temp=a;
		int sum=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		if(temp==sum) {
			System.out.println(temp+" is a perfectNo");
		}else {
			System.out.println(temp+" is not a perfectNo");
		}
	}
}
