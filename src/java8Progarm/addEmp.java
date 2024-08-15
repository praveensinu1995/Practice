package java8Progarm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class addEmp {

	public List<Emp> addEmp() {
		List<Emp> emp=new ArrayList<>();
		Random random=new Random();
		for(int i=1;i<=100;i++) {
			Emp e=new Emp();
			e.setId(i);
			e.setName(i+"-name");
			e.setSal(random.nextInt(2000));
			emp.add(e);
		}
		return emp;
	}
}
