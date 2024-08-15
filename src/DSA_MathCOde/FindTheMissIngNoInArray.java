package DSA_MathCOde;

public class FindTheMissIngNoInArray {

	public static void main(String[] args) {
		int [] arr= {0,1,2,3,5};
		int sumOfNoWithFormula=(arr.length*(arr.length+1))/2;
		System.out.println(sumOfNoWithFormula);
		int sumOfArr=0;
		for(int i=0;i<arr.length;i++) {
			sumOfArr+=i;
		}
		System.out.println(sumOfArr);
		System.out.println("the mising no in an array is :"+(sumOfNoWithFormula-sumOfArr));
	}
}
