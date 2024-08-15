package InterviweQuestion;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8Progarm.Emp;

public class HighestEMp {

	public static void main(String[] args) {
		EMP emp=new EMP();
		
		List<EMP> collect = emp.getListEmp(10).stream().sorted(Comparator.comparingDouble(EMP::getSal).reversed()).collect(Collectors.toList());
		collect.forEach(System.out::println);
		List<EMP> map= emp.getListEmp(5).stream().sorted(Comparator.comparingDouble(EMP::getSal))
				.collect(Collectors.toList());
//				.collect(Collectors.groupingBy(EMP::getSal,Collectors.counting()));
		map.forEach(System.out::println);
//		map.forEach((a,b)->System.out.println(a +" "+b));
		System.out.println("sorting by name");
		
		emp.getListEmp(5).stream().sorted(Comparator.comparing(EMP::getName).reversed()).collect(Collectors.toList()).forEach(System.out::println);;
		
		System.out.println("sorting by id");
		emp.getListEmp(5).stream().sorted(Comparator.comparingInt(EMP::getId).reversed()).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("sorting by id and name ");
		
		List<EMP> listEmp = emp.getListEmp(5);
		listEmp.get(0).setName("parveen");
		listEmp.get(1).setName("Naveen");
		listEmp.get(2).setName("Bharath");
		listEmp.get(3).setName("Shashi");
		listEmp.get(4).setName("Younus");
		listEmp.stream().sorted((Comparator.comparing(EMP::getName)).thenComparing(EMP::getId)).collect(Collectors.toList()).forEach(System.out::println);;
	}
}
