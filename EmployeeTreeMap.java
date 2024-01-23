package task_12;

import java.util.*;

public class EmployeeTreeMap {

	public static void main(String[] args) {

		TreeMap<Integer, String> employeeMap = new TreeMap<>();

		employeeMap.put(1, "Kumar");
		employeeMap.put(2, "Raj");
		employeeMap.put(3, "Sanduru");
		employeeMap.put(4, "Vikey");
		employeeMap.put(5, "Muthu");

		System.out.println("Employee names in alphabetical order:");
		for (String employeeName : employeeMap.values()) {
			System.out.println(employeeName);
		}
	}
}
