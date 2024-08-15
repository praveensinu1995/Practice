package DSA_Array;

import java.util.Arrays;
import java.util.Iterator;

public class BigNoInArray {
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,0};
		
		int largest=a[0];
		for (int i = 1; i < a.length; i++) {
			if(largest<a[i]) {
				int temp=largest;
				largest=a[i];
//				a[i]=largest;
			}
		}
		System.out.println(largest);
		
		int traget=2;
		int j=a.length-1;
		int index=0;
		for (int i = 0; i <=j; i++) {
			if(a[i]==traget) {
				index=i;
			}else if (a[i]==traget) {
				index=i;
			}
			j--;
		}
		System.out.println(index);
	}

}
