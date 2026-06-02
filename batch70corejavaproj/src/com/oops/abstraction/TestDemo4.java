package com.oops.abstraction;

class Laptop {
	String name = "DELL";
}

public class TestDemo4 {
	Laptop getLaptopObj() {
		return new Laptop();
	}

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		System.out.println("main method started ");
		TestDemo4 t = new TestDemo4();
		Laptop l = t.getLaptopObj();
		System.out.println(l.name);

		Class c = Class.forName("com.oops.abstraction.Laptop");
		Object obj = c.getDeclaredConstructor().newInstance();
		System.out.println(obj);

	}

}
