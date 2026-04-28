package com.oops01;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp2 = new Employee("101", "Sriaknth");
		System.out.println(emp2.getEid());
		System.out.println(emp2.getEname());

		Employee emp1 = new Employee();
		emp1.setEid("090");
		System.out.println(emp1.getEid());
	}

}
