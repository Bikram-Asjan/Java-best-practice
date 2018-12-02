package TreeMapProgram;

import java.util.TreeMap;

public class SortUsingEmployeeName {

	public static void main(String[] args) {
		TreeMap<Employee, String> tm = new TreeMap<>(new SalaryComparator());
		tm.put((new Employee(1, "Bikram", 35000)),"Bikram");
		tm.put((new Employee(2, "biswajit", 38000)), "Biswajit");
		tm.put((new Employee(3, "tamal",25000)), "Tamal");
		tm.put((new Employee(4, "Subhadeep", 20000)), "Subhadep");
		
		tm.forEach((key,value) -> System.out.println("key "+key+"\t\t"+"Value "+value));
	}

}
