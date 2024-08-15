package DSA_Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SingleNo {

	public static void main(String[] args) {
		int[] nums = { -1, 2, 2, 1, -7, -7, 7 };
		HashMap<Integer, Integer> map = new HashMap<>();
		
		Map<Integer, Long> collect = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(a->a,Collectors.counting()));
		
		List<Entry<Integer, Long>> collect2 = collect.entrySet().stream().filter(e->e.getValue()==1).collect(Collectors.toList());
		System.out.println(collect2);
//		int j = nums.length - 1;
//		for (int i = 0; i <j; i++) {
//			map.put(nums[i], map.get(nums[i]) == null ? 1 : map.get(nums[i]) + 1);
//			map.put(nums[j], map.get(nums[j]) == null ? 1 : map.get(nums[j]) + 1);
//			j--;
//		}
//		for (Entry<Integer, Integer> i : map.entrySet()) {
//			if (i.getValue() == 1) {
//				System.out.println(i.getKey());
//			}
//		}
	}
}
