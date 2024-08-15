package InterviweQuestion;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InterviewPractice {

	public static void main(String[] args) {
		EMP emp = new EMP();
		List<EMP> list = emp.getListEmp(10);
//		list.stream().filter(e -> e.sal <= 200).collect(Collectors.toList()).forEach(System.out::println);
		List<EMP> mapList= list.stream().sorted(Comparator.comparing(EMP::getName).reversed())
				.collect(Collectors.toList());
		mapList.forEach((a)->System.out.println("name "+a));
		emp.getListEmpWithDuplicat().stream().collect(Collectors.groupingBy(EMP::getSal,Collectors.counting()))
		.forEach((a,b)->System.out.println(a+"repeted time " +b));;
		emp.getListEmpWithDuplicat().stream().sorted(Comparator.comparing(EMP::getName,String.CASE_INSENSITIVE_ORDER).reversed()).forEach(System.out::println);
		Random random=new Random();
		System.out.println(list.get(random.nextInt(list.size())));
	
		
	}

}
