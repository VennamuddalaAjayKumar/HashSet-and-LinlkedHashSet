package collections.sets.hash;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DepartmentRunner {
public static void main(String[] args) {
		
		Set<Department> dept = new HashSet<Department>();
			dept.add(new Department());
			dept.add(new Department(101,"Application Developer"));
			dept.add(new Department(102,"Software Tester"));
			dept.add(new Department(103,"System Admin"));
			dept.add(new Department(105,"Technical Supporter"));
			dept.add(new Department(124,"API Testing"));
			dept.add(new Department(101,null));
			dept.add(new Department(102,"Software Tester"));
			
			System.out.println("Hashset: "+dept);
			
			System.out.println("======================");
			Set<Department> dept1 = new LinkedHashSet<Department>();
			dept1.add(new Department());
			dept1.add(new Department(101,"Application Developer"));
			dept1.add(new Department(102,"Software Tester"));
			dept1.add(new Department(103,"System Admin"));
			dept1.add(new Department(105,"Technical Supporter"));
			dept1.add(new Department(124,"API Testing"));
			dept1.add(new Department(101,null));
			dept1.add(new Department(102,"Software Tester"));
			
			System.out.println("LinkedHashset: "+dept1);
			
}
}
