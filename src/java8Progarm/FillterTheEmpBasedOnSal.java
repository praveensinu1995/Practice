package java8Progarm;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FillterTheEmpBasedOnSal {

	public static void main(String[] args) {
		addEmp emp = new addEmp();
		List<Emp> addEmp = emp.addEmp();
		System.out.println(addEmp.size());
		List<Emp> collect2 = addEmp.stream().filter(e->e.getSal()>100).collect(Collectors.toList());
		List<Emp> collect3 = addEmp.stream().sorted(Comparator.comparing(Emp::getName).reversed()).collect(Collectors.toList());
		System.out.println("============================================");
		collect3.forEach(System.out::println);
		System.out.println("==========================================");
		System.out.println("list of emp sal greater than 100:"+collect2);
//		to prin all emp were sal is greter than 1000
		 addEmp.stream().filter(e->e.getSal()>1000).forEach(e->System.out.println(e.getSal()));
//		avg sal
		 List<Emp> collect = addEmp.stream().filter(e->e.getSal()>1000).collect(Collectors.toList());
		 System.out.println(collect.size());
		
	}
}
