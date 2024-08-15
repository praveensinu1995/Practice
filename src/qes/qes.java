package qes;

public class qes {

	public static void main(String[] args) {
		
		
		int[] a = {2,6,10,14,18,19,21, 29, 34};
//		end=4
		int target=2;
		int strat=0;
		int end=a.length-1;
		while (strat<=end) {
//			int mid = (start + end)/2; intter max
			int mid=strat+(end-strat)/2;
			if(a[mid]==target) {
				System.out.println(mid);
				break;
			}else if (target>a[mid]) {
				strat=mid+1;
			}else {
				end=mid-1;
			}
			
		}
		
		 
	}
}
