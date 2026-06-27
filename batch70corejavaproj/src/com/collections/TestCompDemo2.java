package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompDemo2 {

	public static void main(String[] args) {

		Employee emp1 = new Employee(7, "Dhoni", 9977777777L, 43, 700000.00);
		Employee emp2 = new Employee(18, "Kohli", 9181818181L, 38, 1800000.00);
		Employee emp3 = new Employee(1, "K L Rahul", 9911111111L, 35, 1000000.00);
		Employee emp4 = new Employee(45, "Rohit", 9945454545L, 38, 4500000.00);
		Employee emp5 = new Employee(8, "Jadeja", 9988888888L, 37, 800000.00);

		List<Employee> empList = new ArrayList<>();

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		
		Collections.sort(empList);
		
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}

}
