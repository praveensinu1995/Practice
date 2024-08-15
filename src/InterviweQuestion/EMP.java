package InterviweQuestion;

import java.util.ArrayList;
import java.util.List;

public class EMP {

	int id;
	String name;
	double sal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public EMP(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public EMP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<EMP> getListEmp(int noEMp) {
		List<EMP> emps=new ArrayList<>();
		
		for(int i=0;i<noEMp;i++) {
			EMP emp=new EMP(i+1,"name"+i,100+(i)*100);
			emps.add(emp);
		}
		return emps;
	}
	public List<EMP> getListEmpWithDuplicat() {
		List<EMP> emps=new ArrayList<>();
		
		emps.add(new EMP(1,"praveen",100.00));
		emps.add(new EMP(4,"Naveen",200.00));
		emps.add(new EMP(2,"Kushal",200.00));
		emps.add(new EMP(5,"Bharath",300.00));
		emps.add(new EMP(3,"Younus",100.00));
		return emps;
	}
	
	@Override
	public String toString() {
		return "EMP [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
}
