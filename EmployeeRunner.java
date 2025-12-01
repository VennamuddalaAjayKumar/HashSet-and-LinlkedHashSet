package collections.sets.hash;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Set<Employee> employee = new HashSet<Employee>();
			employee.add(new Employee());
			employee.add(new Employee(001,"Ajay"));
			employee.add(new Employee(002,"Sasi"));
			employee.add(new Employee(003,"Charan"));
			employee.add(new Employee(004,"Arpitha"));
			employee.add(new Employee(005,"Supritha"));
			employee.add(new Employee(006,"Vaishak"));
			employee.add(new Employee(001,"Ajay"));
			employee.add(new Employee(005,"Supritha"));
			employee.add(new Employee(005,null));
			
			System.out.println("HashSet: "+employee);
			
			System.out.println("======================");
			
			Set<Employee> employee1 = new LinkedHashSet<Employee>();
			employee1.add(new Employee());
			employee1.add(new Employee(001,"Ajay"));
			employee1.add(new Employee(002,"Sasi"));
			employee1.add(new Employee(003,"Charan"));
			employee1.add(new Employee(004,"Arpitha"));
			employee1.add(new Employee(005,"Supritha"));
			employee1.add(new Employee(006,"Vaishak"));
			employee1.add(new Employee(001,"Ajay"));
			employee1.add(new Employee(005,"Supritha"));
			employee1.add(new Employee(005,null));
			
			System.out.println("LinkedHashSet: "+employee1);
		
	}

}
