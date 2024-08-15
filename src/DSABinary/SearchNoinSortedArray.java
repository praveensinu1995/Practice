package DSABinary;

public class SearchNoinSortedArray {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 6, 10, 15, 20, 22, 36, 40 };
		int low = 0;
		int high = arr.length - 1;
		int no = 36;
		int count=0;
		boolean found = false;
		while (low <= high) {
			count++;
			int mid = (low + high) / 2;
			if (arr[mid] == no) {
				System.out.println("no present in " + mid + " index");
				found = true;
			}
			if (arr[mid] < no) {
				low = mid +1;

			} else {
				high = mid - 1;
			}

		}
		if (!found) {
			System.out.println("no not found");
		}

		System.out.println(count);
	}
}
