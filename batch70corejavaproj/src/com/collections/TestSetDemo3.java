package com.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
	int pid;
	String name;

	public Person(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		Person p = (Person) obj;
		return pid == p.pid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pid);
	}
}

public class TestSetDemo3 {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<>();
		s.add(10);
		s.add(10);
		System.out.println(s.size());// 1

		Set<String> ss = new HashSet<>();
		ss.add("Srikanth");
		ss.add("Srikanth");
		System.out.println(ss.size());// 1

		Set<Person> s1 = new HashSet<>();
		Person p1 = new Person(101, "Srikanth");
		Person p2 = new Person(101, "Srikanth");
		s1.add(p1);
		s1.add(p2);
		System.out.println(s1.size());//2

	}

}
