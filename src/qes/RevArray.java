package qes;

import java.util.Iterator;

public class RevArray {

	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		int c=0;
		while(c<100) {
			System.out.println(a);
			c=a+b;
			b++;
			a=b;
			b=c;
		}
	} 
	
}
