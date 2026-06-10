package com.collections;

import java.util.List;
import java.util.Stack;

//Queue : FIFO : First In First Out 
//Stack : LIFO : Last In First Out 
public class TestStackDemo1 {

	public static void main(String[] args) {

		Stack<String> ll = new Stack<>();

		ll.push("J2SE");
		ll.push("J2EE");
		ll.push("MYSQL");
		ll.push("HTML");
		ll.push("JAVASCRIPT");
		ll.push("SERVELTS");
		ll.push("SPRING");
		ll.push("SPRING BOOT");
		ll.push("MICROSERVICES");
		ll.push("JPA");
		
		System.out.println(ll.search("HTML"));//

//		 true if and only if this stack contains no items; false otherwise.
		System.out.println(ll.empty());

//		Removes the object at the top of this stack and returns that object as the value of this function.
		System.out.println(ll.pop());// JPA

//		Looks at the object at the top of this stack without removing it from the stack.
		System.out.println(ll.peek());// Microservices

		System.out.println(ll);

	}

}
