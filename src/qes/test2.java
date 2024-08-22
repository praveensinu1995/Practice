package qes;

import java.util.ArrayList;
import java.util.List;

public class test2 {

	 public static void main(String[] args) {
	        Object[] arr = {1, 35, 6, 6, new Object[]{4, 5, 7, 8, new Object[]{5, 7, 9, 1}}};

	        List<Integer> resultList = new ArrayList();
	        flattenArray(arr, resultList);

	        Integer[] resultArray = resultList.toArray(new Integer[0]);

	        // Print the result array
	        for (Integer num : resultArray) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void flattenArray(Object[] arr, List<Integer> resultList) {
	        for (Object element : arr) {
	            if (element instanceof Integer) {
	                resultList.add((Integer) element);
	            } else if (element instanceof Object[]) {
	                flattenArray((Object[]) element, resultList);
	            }
	        }
	    }
}
